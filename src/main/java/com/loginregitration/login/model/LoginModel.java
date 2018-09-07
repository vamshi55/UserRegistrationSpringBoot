package com.loginregitration.login.model;

import java.util.UUID;

public abstract class LoginModel {
	private UUID loginId;
	private String name;
	private String email;
	private String password;
	public UUID getLoginId() {
		return loginId;
	}
	public void setLoginId(UUID loginId) {
		this.loginId = loginId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
