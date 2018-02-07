package com.ind.empmgmt.bean;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="employees")
public class Employees {

	private List<Employee> employees;

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {		
		this.employees = employees;
	}
	
	
}
