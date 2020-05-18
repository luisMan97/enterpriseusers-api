package com.luis.enterpriseusers.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.luis.enterpriseusers.model.DetailDate;

@XmlRootElement(name = "getemployee")
public class Employee {
	private DetailDate age;
	private DetailDate vinculation;
	
	public Employee(DetailDate age, DetailDate vinculation) {
		super();
		this.setVinculation(vinculation);
		this.setAge(age);
	}
	
	@XmlElement(name = "getage")
	public DetailDate getAge() {
		return age;
	}
	
	public void setAge(DetailDate age) {
		this.age = age;
	}

	@XmlElement(name = "getvinculation")
	public DetailDate getVinculation() {
		return vinculation;
	}

	public void setVinculation(DetailDate vinculation) {
		this.vinculation = vinculation;
	}
}

