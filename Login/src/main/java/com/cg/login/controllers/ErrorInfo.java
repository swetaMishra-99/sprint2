package com.cg.login.controllers;
/**
 * ErrorInfo Class
 * @author swetmish
 *
 */
public class ErrorInfo {
	/**
	 * DataMembers
	 */
	private int statusCode;
	private String status;
	private String errors;
	private String path;
	/**
	 * Default Constructor
	 */
	public ErrorInfo() {
		super();
	}
	/**
	 * Parametric Constructor
	 * @param statusCode
	 * @param status
	 * @param errors
	 * @param path
	 */
	public ErrorInfo(int statusCode, String status, String errors, String path) {
		super();
		this.statusCode = statusCode;
		this.status = status;
		this.errors = errors;
		this.path = path;
	}
	/**
	 * StatusCode getter Method
	 * @return
	 */
	public int getStatusCode() {
		return statusCode;
	}
	/**
	 * StatusCode setter Method
	 * @param statusCode
	 */
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	/**
	 * Status getter Method
	 * @return
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * Status setter Method
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * Errors getter Method
	 * @return
	 */
	public String getErrors() {
		return errors;
	}
	/**
	 * Error Setter Method
	 * @param errors
	 */
	public void setErrors(String errors) {
		this.errors = errors;
	}
	/**
	 * Path getter Method
	 * @return
	 */
	public String getPath() {
		return path;
	}
	/**
	 * Path setter Method
	 * @param path
	 */
	public void setPath(String path) {
		this.path = path;
	}
	/**
	 * ToString Method
	 */
	@Override
	public String toString() {
		return "ErrorInfo [statusCode=" + statusCode + ", status=" + status + ", errors=" + errors + ", path=" + path
				+ "]";
	}
	
}
