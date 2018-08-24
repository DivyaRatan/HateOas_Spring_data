package com.demo.rest.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.rest.dao.EmployeeDao;
import com.demo.rest.exception.InvalidCustomerException;
import com.demo.rest.pojo.Employee;

@Service
public class EmployeeService implements EmployeeServiceIntrfc{
	@Autowired
	private EmployeeDao dao;

	@Override
	public void addEmployee(Employee employee) {
		dao.save(employee);

	}
	@Override
	public Collection<Employee> viewAllEmployee() {
		return dao.findAll();
	}

	@Override
	public void updateEmployee(Employee employee) {
		dao.save(employee);
		
	}

	@Override
	public void deleteEmployee(int employeeId) {
		dao.deleteById(employeeId);
		
	}
	@Override
	public Employee getEmployeeById(int employeeId)  {
		return dao.findById(employeeId).get();
	}

}