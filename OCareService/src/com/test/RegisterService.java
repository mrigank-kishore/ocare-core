package com.test;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.care.service.cbdb.core.sdo.ServiceLocation;
import com.google.gson.Gson;

@Path("/login")
public class RegisterService {
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/doRegister")
	public Response doRegister(ServiceLocation input)	{
		Gson gson = new Gson();
		System.out.println(gson.toJson(input));
		Map<String, String> responseMap = new HashMap<String, String>();
		responseMap.put("status", "Success");
		
		return Response.status(200).entity(responseMap).build();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
