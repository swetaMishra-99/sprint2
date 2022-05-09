package com.cg.login.controllers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cg.login.entity.Login;
import com.cg.login.service.LoginService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
public class LoginController {
	
	//logger
	
	Logger logger=LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	LoginService loginService;
	
	
	/**
	 * fetching all registered users data
	 * @return list of login users
	 */
	
	@Operation(summary = "To Fetch All data")
	@GetMapping("/users")
	public List<Login> fetchAllData(){
		String message="All Data of Users Are Fetched";
		logger.info("Inside the method [fetchAllData] of controller:"+message);
		return loginService.fetchAllData();
	}
	
	/**
	 * For registration
	 * @param register
	 * @param request
	 * @return message
	 */
	
	@Operation(summary = "For Registration")
	@PostMapping("/registers")
	public ResponseEntity<ResponseInfo> addUsers(@Valid @RequestBody Login register,HttpServletRequest request){
		String message=loginService.addUsers(register);
		logger.info("Inside the method [addUsers] of controller:"+message);
		ResponseInfo rinfo=new ResponseInfo(HttpStatus.CREATED.value(),HttpStatus.CREATED.name(),message,request.getRequestURI());
		return new ResponseEntity<ResponseInfo>(rinfo,HttpStatus.OK);
	}

	/**
	 * For login
	 * @param login
	 * @param request
	 * @return message
	 */ 
	
	@Operation(summary = "To Login")
	@PostMapping("/logins") 
	public ResponseEntity<ResponseInfo> validateUsers(@Valid @RequestBody Login login,HttpServletRequest request){
	  String message=loginService.validateUsers(login);
	  logger.info("Inside the method [validateUsers] of controller:"+message);
	  ResponseInfo rinfo=new ResponseInfo(HttpStatus.ACCEPTED.value(),HttpStatus.ACCEPTED.name(),message,request.getRequestURI());
	  return new ResponseEntity<ResponseInfo>(rinfo,HttpStatus.OK); 
	}
	
	/**
	 * For removing user
	 * @param username
	 * @param request
	 * @return message
	 */
	
	@Operation(summary = "To Logout ")
	@DeleteMapping("/logouts/{username}") 
	public ResponseEntity<ResponseInfo> removeUser(@PathVariable ("username") String username,HttpServletRequest request){
	  String message=loginService.removeUser(username);
	  logger.info("Inside the method [removeUser] of controller:"+message);
	  ResponseInfo rinfo=new ResponseInfo(HttpStatus.FOUND.value(),HttpStatus.FOUND.name(),message,request.getRequestURI());
	  return new ResponseEntity<ResponseInfo>(rinfo,HttpStatus.OK); 
	}
}
