package com.cg.login.exceptions;
@SuppressWarnings("serial")
public class PasswordNotFoundException extends RuntimeException{
	public PasswordNotFoundException(String message) {
		super(message);
	}
}
