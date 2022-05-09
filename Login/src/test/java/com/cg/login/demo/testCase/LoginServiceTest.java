package com.cg.login.demo.testCase;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.cg.login.entity.Login;
import com.cg.login.repository.LoginRepository;
import com.cg.login.service.LoginService;

@ExtendWith(SpringExtension.class)
public class LoginServiceTest {
	Login user = new Login("SWETMISH","Sweta2456");

	String username="SWETMISH";
	String password="Sweta2456";
	String role="Student";
	String active="true";
	
	String w = "Data Saved Successfully";
	String x = "login Successfull!!";
	String y="Logout Successfully!!";
	String z="not equal";
	
	@Mock
	private LoginRepository loginRepository;
	
	@InjectMocks
	private LoginService loginService;
	
	//Positive test case for addUser method
	
	@Test
	void testAddUser(){
		when(loginRepository.save(user)).thenReturn(user);
        assertEquals(w, loginService.addUsers(user));
	}
	
	//Negative test case for addUser method
	
	@Test
	void testFailAddUser(){
		when(loginRepository.save(user)).thenReturn(user);
        assertNotEquals(z, loginService.addUsers(user));
	}
	
	//Positive test case for fetchAllData method
	
	@Test
	void testFetchAllData() {
		List<Login> user=new ArrayList<>();
		user.add(new Login("SWETMISH","Sweta2456"));
		user.add(new Login("StutiSarita","Stuti16"));
		when(loginRepository.findAll()).thenReturn(user);
		assertEquals(user,loginService.fetchAllData());
		
	}
	
	//Negative test case for fetchAllData method
	
	@Test
	void testFailFetchAllData() {
		List<Login> user=new ArrayList<>();
		user.add(new Login("SWETMISH","Sweta2456"));
		user.add(new Login("StutiSarita","Stuti16"));
		when(loginRepository.findAll()).thenReturn(user);
		assertNotEquals(z,loginService.fetchAllData());
		
	}
	
	//Positive test case for removeUser method
	
	@Test
	void testRemoveUser() {
		Login user=new Login("SWETMISH","Sweta2456");
		when(loginRepository.findById(user.getUsername())).thenReturn(Optional.of(user));
		when(loginRepository.save(user)).thenReturn(user);
		assertEquals(y,loginService.removeUser(username));
		
	}
	
	//Negative test case for removeUser method
	
	@Test
	void testFailRemoveUser() {
		Login user=new Login("SWETMISH","Sweta2456");
		when(loginRepository.findById(user.getUsername())).thenReturn(Optional.of(user));
		when(loginRepository.save(user)).thenReturn(user);
		assertNotEquals(z,loginService.removeUser(username));
		
	}

}
