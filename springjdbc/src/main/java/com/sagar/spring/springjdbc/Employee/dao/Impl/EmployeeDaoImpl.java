package com.sagar.spring.springjdbc.Employee.dao.Impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sagar.spring.springjdbc.Employee.dao.EmployeeDao;
import com.sagar.spring.springjdbc.Employee.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstname(), employee.getLastname());
		return result;
	}

}
