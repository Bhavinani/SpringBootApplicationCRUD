package com.springapp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapp.pojo.Employee;
import com.springapp.repository.EmployeeRepository;
import com.springapp.service.EmployeeService;


@Service 
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee SaveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

}
