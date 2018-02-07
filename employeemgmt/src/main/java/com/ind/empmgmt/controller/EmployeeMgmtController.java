package com.ind.empmgmt.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ind.empmgmt.bean.Employee;
import com.ind.empmgmt.bean.Employees;

@RestController
public class EmployeeMgmtController {
	
	private static Logger LOG = LoggerFactory.getLogger(EmployeeMgmtController.class);
	
	@GetMapping(path="/employees",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getEmployees() {
		
		LOG.info("Controller: Employee controller is called");
		
		Employee emp1=new Employee(1001,"Shankhadeep","2000.00");
		Employees emps=new Employees();
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(emp1);
		emp1=null;
		emp1=new Employee(1002,"Kartik","3000.00");
		employees.add(emp1);
		emps.setEmployees(employees);
		
		LOG.info("Controller: Employees returned succesfully "+emps);
		return new ResponseEntity(emps,HttpStatus.OK);
		
	}
	

}
