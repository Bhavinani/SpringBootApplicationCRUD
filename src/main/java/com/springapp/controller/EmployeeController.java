package com.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springapp.pojo.Employee;
import com.springapp.service.EmployeeService;

@RestController
@RequestMapping("/apis/employee")
public class EmployeeController {
	
	
	@Autowired
	EmployeeService employeeService;
	
	
	// Save the employee in Database 
	@PostMapping("/SaveEmployee")
	public ResponseEntity<Employee> SaveEmployee(@RequestBody Employee  employee)
	{
		
		Employee saveemployee=employeeService.SaveEmployee(employee);
		return new ResponseEntity<Employee>(saveemployee, HttpStatus.CREATED);
	}
	
	

}
