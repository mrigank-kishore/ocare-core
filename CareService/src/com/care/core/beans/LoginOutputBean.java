package com.care.core.beans;

public class LoginOutputBean {
	private String status;//login pass or fail
	private String role;
	private String account;//active or deactivated
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
}