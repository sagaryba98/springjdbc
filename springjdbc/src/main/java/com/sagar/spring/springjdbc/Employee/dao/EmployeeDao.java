package com.sagar.spring.springjdbc.Employee.dao;

import java.util.List;

import com.sagar.spring.springjdbc.Employee.dto.Employee;

public interface EmployeeDao {
	int create(Employee employee);
	int update(Employee employee);
	int delete(int id);
	Employee read(int id);
	
	List<Employee> read();
	

}
