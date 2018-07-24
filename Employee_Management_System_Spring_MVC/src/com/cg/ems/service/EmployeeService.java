package com.cg.ems.service;

import java.util.List;

import com.cg.ems.beans.Employee;


public interface EmployeeService {
	
	public Employee addEmployee(Employee employee);
	
	public Employee getEmployee(int id) ;
	
	public Employee updateEmployee(Employee employee);
	
	public void removeEmployee (Employee employee) ;
	
	public List<Employee> getAllEmployees();
	

}
