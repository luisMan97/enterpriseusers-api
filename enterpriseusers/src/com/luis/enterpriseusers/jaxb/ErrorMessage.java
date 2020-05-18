package com.luis.enterpriseusers.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.luis.enterpriseusers.model.DetailDate;

@XmlRootElement(name = "getemployee")
public class ErrorMessage {
	private String message;
	private DetailDate vinculation;
	
	public ErrorMessage(String message) {
		super();
		this.setMessage(message);
	}
	
	@XmlElement(name = "getmessage")
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
