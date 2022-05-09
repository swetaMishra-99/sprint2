package com.cg.login.service;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.cg.login.entity.Login;
import com.cg.login.exceptions.PasswordNotFoundException;
import com.cg.login.exceptions.RecordNotFoundException;
import com.cg.login.exceptions.UserNameNotFoundException;
import com.cg.login.repository.LoginRepository;

@Service
public class LoginService {
	
	//logger
	
	Logger logger=LoggerFactory.getLogger(LoginService.class); 
	
	@Autowired
	LoginRepository loginRepository;
	
	/**
	 * to add users in database
	 * @param register
	 * @return message
	 */
	
	public String addUsers(Login register) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodePassword = passwordEncoder.encode(register.getPassword());//To encrypt password
		register.setPassword(encodePassword);
		Login saveDetail = loginRepository.save(register);//To save user details in database
		if (saveDetail != null) {
			return "Data Saved Successfully";
		} 
		else {
			return "Data Not Saved Successfully";
		}

	}
	
	/**
	 * validating user 
	 * @param login
	 * @return response to controller
	 */
	
	public String validateUsers(Login login){ 
		Optional<Login> optional=loginRepository.findById(login.getUsername());//To check whether the detail of the given id is present or not
		if(optional.isPresent()) { 
			Login dbUser=optional.get(); 
			BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
		    Boolean value=passwordEncoder.matches(login.getPassword(),dbUser.getPassword())?true:false;//matches the provided credentials with stored data in database
		    if(value==true) { 
		    	return "login Successfull!!"; 
		    }
		    else{ 
		    	logger.error("PasswordNotFoundException occurred");
		    	throw new PasswordNotFoundException("Password Incorrect");
		    }
		} 
		else { 
			logger.error("UserNameNotFoundException occurred");
			throw new UserNameNotFoundException("Username not found");
		}
	}
	
	/**
	 * fetching data
	 * @return  list of data of all login users 
	 */
	
	public List<Login> fetchAllData(){
		List<Login> list=loginRepository.findAll();//To fetch all data of database
		if(!list.isEmpty()) {
			return list;
		}
		else {
			logger.error("RecordNotFoundException occured");
			throw new RecordNotFoundException("No Record");
		}
	}
	
	/**
	 * to remove user
	 * @param username
	 * @return message
	 */
	
	public String removeUser(String username) {
		Optional<Login> details=loginRepository.findById(username);//To fetch the details of given id
		if(details.isPresent()) {
			loginRepository.deleteById(username);//to remove the id
			return "Logout Successfully!!";
		}
		else {
			logger.error("UserNameNotFoundException occured");
			throw new UserNameNotFoundException("Username not found");
		}
	}
}
	
