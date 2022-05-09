package com.cg.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Login API", version = "2.0", description = "Registration Login System",contact =@Contact(email ="sweta.b.mishra@capgemini.com"),license =@License(name = "License 5.0")))

public class LoginModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginModuleApplication.class, args);
	}
	@Bean
	RestTemplate getRestTemplate() {
		RestTemplate restTemplate=new RestTemplate();
		return restTemplate;
	}

}
