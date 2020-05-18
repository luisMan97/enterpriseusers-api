package com.luis.enterpriseusers.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.luis.enterpriseusers.jaxb.Employee;
import com.luis.enterpriseusers.model.DetailDate;

@Path("/rws")
public class RestWebService {
	
	@GET
	@Path("/employee/json")
	@Produces({MediaType.APPLICATION_JSON})
	public Employee getDataJSON() {
		DetailDate vinculation = new DetailDate(1, 3, 14);
		DetailDate age = new DetailDate(21, 2, 25);
		Employee em = new Employee(age, vinculation);
		return em;
	}
	
}
