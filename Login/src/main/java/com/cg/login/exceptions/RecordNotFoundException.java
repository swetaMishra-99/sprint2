package com.cg.login.exceptions;
@SuppressWarnings("serial")
public class RecordNotFoundException extends RuntimeException{
	public RecordNotFoundException(String message) {
		super(message);
	}
}
