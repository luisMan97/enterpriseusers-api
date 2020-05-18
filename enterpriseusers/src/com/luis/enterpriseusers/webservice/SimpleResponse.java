package com.luis.enterpriseusers.webservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/simpleresponse")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class SimpleResponse {
	
	@GET
	public Response getMessage() {
		return Response.ok("This is a simple message", MediaType.APPLICATION_JSON).build();
	}

}
