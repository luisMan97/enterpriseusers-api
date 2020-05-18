package com.luis.enterpriseusers.webservice;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.luis.enterpriseusers.jaxb.Employee;
import com.luis.enterpriseusers.jaxb.ErrorMessage;
import com.luis.enterpriseusers.model.DetailDate;
import com.luis.enterpriseusers.utils.helpers.DateHelper;

@Path("/api")
public class RestWebService {
	
	@GET
	@Path("/employee")
	@Produces({MediaType.APPLICATION_JSON})
	public Response getDataJSON(@QueryParam("name") String name,
								@QueryParam("lastname") String lastname,
								@QueryParam("document_type") String documentType,
								@QueryParam("document") String document,
								@QueryParam("birth") String birth,
								@QueryParam("vinculation") String vinculation,
								@QueryParam("position") String position,
								@QueryParam("salary") Double salary) {
		if (name == null || lastname == null || documentType == null || document == null || birth == null || vinculation == null || position == null || salary == null) {
			ErrorMessage errorMessage = new ErrorMessage("All fields are required");
			return Response.status(400).entity(errorMessage).build();
		}
		
		if (name.isEmpty() || lastname.isEmpty() || documentType.isEmpty() || document.isEmpty() || birth.isEmpty() || vinculation.isEmpty() || position.isEmpty() || salary < 0) {
			ErrorMessage errorMessage = new ErrorMessage("Fields is not should empty");
			return Response.status(400).entity(errorMessage).build();
		}
		
		DateHelper dh = new DateHelper();
		Date bithDate = dh.StringToDate(birth);
		Date vinculationDate = dh.StringToDate(vinculation);
		
		if (bithDate == null || vinculationDate == null) {
			ErrorMessage errorMessage = new ErrorMessage("Date is not correct format");
			return Response.status(400).entity(errorMessage).build();
		}
		
		Calendar calendar = Calendar.getInstance();
		dh.setCalendar(calendar);
		
		dh.getCalendar().setTime(bithDate);
		DetailDate vd = new DetailDate(dh.getYear(), dh.getMonth(), dh.getDay());
		
		dh.getCalendar().setTime(vinculationDate);
		DetailDate age = new DetailDate(dh.getYear(), dh.getMonth(), dh.getDay());
		
		Employee em = new Employee(age, vd);
		return Response.status(202).entity(em).build();
	}
	
}
