package com.care.core.service;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.care.core.beans.LoginInputBean;
import com.care.core.beans.LoginOutputBean;

@Path("/login")
public class Login {
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/doLogin")
	public LoginOutputBean doLogin(@Context HttpServletRequest request, LoginInputBean input)	{
		LoginOutputBean result = new LoginOutputBean();
		System.out.println(request.getRemoteAddr());
		System.out.println(input.getMobno() + input.getPass());
		return result;
	}
	
	public String changePass()	{
		return null;
	}
}
