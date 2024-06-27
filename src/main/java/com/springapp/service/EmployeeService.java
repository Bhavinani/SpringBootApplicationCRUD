package com.springapp.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.springapp.pojo.Employee;

public interface EmployeeService {
	
	public Employee SaveEmployee(Employee employee);
	
	public Employee getEmployeeById(Integer EmpId);
	
	public List<Employee> getAllEmployees();

}
