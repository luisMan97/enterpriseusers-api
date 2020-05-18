package com.luis.enterpriseusers.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.luis.enterpriseusers.jaxb.Employee;

@Path("/rws")
public class RestWebService {
	
	@GET
	@Path("/employee/json")
	@Produces({MediaType.APPLICATION_JSON})
	public Employee getDataJSON() {
		Employee em = new Employee();
		em.setSaludo("23");
		return em;
	}
	
}
