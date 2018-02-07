package com.ind.empmgmt.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ind")
public class EmployeeMgmtInit {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(EmployeeMgmtInit.class, args);
	}
}
