package com.springapp.serviceImpl;

import java.util.List;
import java.util.Optional;

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

	@Override
	public Employee getEmployeeById(Integer EmpId) {
		
		Optional<Employee> employee = employeeRepository.findById(EmpId);
		return employee.orElseThrow(() -> new RuntimeException("Given Employee Id was not Present" +EmpId));
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}

}
