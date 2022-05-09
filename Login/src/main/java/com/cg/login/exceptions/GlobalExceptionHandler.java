package com.cg.login.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.login.controllers.ResponseInfo;
//To handle exception globally
@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(Exception.class)
	ResponseEntity<ResponseInfo> myExceptionHandler(Exception ie,HttpServletRequest req){
		ResponseInfo rinfo=new ResponseInfo(HttpStatus.NOT_FOUND.value(),HttpStatus.NOT_FOUND.name(),ie.getMessage(),req.getRequestURI());
		return new ResponseEntity<ResponseInfo>(rinfo,HttpStatus.NOT_FOUND);
	}
}
