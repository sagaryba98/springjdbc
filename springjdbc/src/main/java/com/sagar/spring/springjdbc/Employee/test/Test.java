package com.sagar.spring.springjdbc.Employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sagar.spring.springjdbc.Employee.dao.EmployeeDao;
import com.sagar.spring.springjdbc.Employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sagar/spring/springjdbc/Employee/test/config.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("employeedao");
//		Employee employee = new Employee();
//		employee.setId(2);
//		employee.setFirstname("Sagar");
//		employee.setLastname("Waiba");
//		
		//Employee read = dao.read(1);
		
		//int result = dao.delete(2);
		//int result=dao.update(employee);
		//int result = dao.create(employee);
		
		List<Employee> result = dao.read();
		System.out.println("Employee record: "+ result);
				
		
	}
}
