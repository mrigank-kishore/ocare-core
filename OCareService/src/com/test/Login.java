package com.test;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/login")
public class Login {
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/dologin")
	public Response doLogin(LoginBean input)	{
		String userUniqueId = "123456";
		System.out.println(input);
		
		return Response.status(200).entity(userUniqueId).build();
	}
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/test")
	public LoginBean test(){
		LoginBean bean = new LoginBean("mig", "Passw0rd");
		return bean;
	}
}
