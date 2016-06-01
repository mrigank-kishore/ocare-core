package com.test;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LoginBean {
	 public String id;
     public String pass;
     
     public LoginBean(){}
     
     public LoginBean(String id, String pass)	{
    	 this.id = id;
    	 this.pass = pass;
     }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
     
}
