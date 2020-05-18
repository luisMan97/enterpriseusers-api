package com.luis.enterpriseusers.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getemployee")
public class Employee {
	private String age;
	
	public Employee() {}
	
	public Employee(String age) {
		super();
		this.age = age;
	}
	
	@XmlElement(name = "getage")
	public String getAge() {
		return age;
	}
	
	public void setSaludo(String age) {
		this.age = age;
	}
}
