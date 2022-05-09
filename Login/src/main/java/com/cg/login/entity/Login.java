package com.cg.login.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * Login Entity Class
 * @author swetmish
 *
 */
@Entity
@Table(name="loginTable")
public class Login {
	@Id
	@NotEmpty
	@Size(min=2,message="Username should have atleast 2 characters")
	private String username;
	@NotEmpty
	@Size(min=8,message="Password should have atleast 8 characters")
	private String password;
	@NotEmpty(message="Role must be enter")
	private String role="user";
	@NotEmpty(message="active must not be empty")
	private String active="true";
	/**
	 * Default Constructor
	 */
	public Login() {
		super();
	}
	/**
	 * Parametric Constructor
	 * @param username
	 * @param password
	 */
	public Login(@NotEmpty @Size (min=2,message="Username should have atleast 2 characters")String  username,@NotEmpty @Size(min=8,message="Password should have atleast 8 characters")String password) {
		super();
		this.username = username;
		this.password = password;
	}
	/**
	 * Username Getter Method
	 * @return
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * Username Setter Method
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * Password Getter Method
	 * @return
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * Password Setter Method
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * Role Getter Method
	 * @return
	 */
	public String getRole() {
		return role;
	}
	/**
	 * Role Setter Method
	 * @param role
	 */
	public void setRole(String role) {
		this.role = role;
	}
	/**
	 * Active getter Method
	 * @return
	 */
	public String getActive() {
		return active;
	}
	/**
	 * Active Setter Method
	 * @param active
	 */
	public void setActive(String active) {
		this.active = active;
	}
	/**
	 * ToString method
	 */
	@Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password + ", role=" + role + ", active=" + active + "]";
	}
	
}
