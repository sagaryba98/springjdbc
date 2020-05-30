package com.sagar.spring.springjdbc.Employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sagar.spring.springjdbc.Employee.dao.EmployeeDao;
import com.sagar.spring.springjdbc.Employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sagar/spring/springjdbc/Employee/test/config.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("employeedao");
		Employee employee = new Employee();
		employee.setId(2);
		employee.setFirstname("John");
		employee.setLastname("Doe");
		
		int result = dao.create(employee);
		System.out.println("Numbers of employee created: "+ result);
				
		
	}
}
