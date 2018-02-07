package com.ind.empmgmt.bean;

public class Employee {
	
	private int empId;
	private String employeeName;
	private String salary;
	
	
	public Employee(int empId, String employeeName, String salary) {
		super();
		this.empId = empId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	

}
