package com.cg.login.dto;

public class User {
	private int userid;
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private String userPassword;
	private double userRating;
	private String userSkills;

	public String getUserSkills() {
		return userSkills;
	}

	public void setUserSkills(String userSkills) {
		this.userSkills = userSkills;
	}

	public int getId() {
		return userid;
	}

	public void setId(int userid) {
		this.userid = userid;
	}

	public String getFirstName() {
		return userFirstName;
	}

	public void setFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getLastName() {
		return userLastName;
	}

	public void setLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getEmail() {
		return userEmail;
	}

	public void setEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getPassword() {
		return userPassword;
	}

	public void setPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public double getRating() {
		return userRating;
	}

	public void setRating(double userRating) {
		this.userRating = userRating;
	}

	public User(int userid, String userFirstName,String userLastName,String userEmail,String userPassword,double userRating, String userSkills) {
		super();
		this.userid = userid;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userRating = userRating;
		this.userSkills = userSkills;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "User [userid=" + userid + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userEmail=" + userEmail + ", userPassword=" + userPassword + ", userRating=" + userRating
				+ ", userSkills=" + userSkills + "]";
	}
}
