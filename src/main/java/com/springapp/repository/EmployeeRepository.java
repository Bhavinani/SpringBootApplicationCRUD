package com.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springapp.pojo.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
