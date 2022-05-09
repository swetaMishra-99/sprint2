package com.cg.login.controllers;

public class ResponseInfo {
	private int statusCode;
	private String status;
	private String message;
	private String path;
	public ResponseInfo() {
		super();
	}
	public ResponseInfo(int statusCode, String status, String message, String path) {
		super();
		this.statusCode = statusCode;
		this.status = status;
		this.message = message;
		this.path = path;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	@Override
	public String toString() {
		return "ResponseInfo [statusCode=" + statusCode + ", status=" + status + ", message=" + message + ", path="
				+ path + "]";
	}
}
