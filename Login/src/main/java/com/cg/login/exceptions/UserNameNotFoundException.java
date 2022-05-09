package com.cg.login.exceptions;
@SuppressWarnings("serial")
public class UserNameNotFoundException extends RuntimeException{
	public UserNameNotFoundException(String message) {
		super(message);
	}
}
