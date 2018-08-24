package com.demo.rest.service;

import java.util.Collection;

import com.demo.rest.pojo.Employee;

public interface EmployeeServiceIntrfc {
	public void addEmployee(Employee employee);
	public Collection<Employee> viewAllEmployee();
	public void updateEmployee(Employee employee);
	public void deleteEmployee(int employeeId);
	public Employee getEmployeeById(int employeeId);

}
