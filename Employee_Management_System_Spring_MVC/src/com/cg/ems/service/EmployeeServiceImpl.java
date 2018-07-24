package com.cg.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.ems.beans.Employee;
import com.cg.ems.repo.EmployeeRepo;

@Component(value="employeeService")
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	EmployeeRepo repo;
	
	@Override
	public Employee addEmployee(Employee employee)  {
		
		return repo.save(employee);
	}

	@Override
	public Employee getEmployee(int id)  {
		
		return repo.findOne(id);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		 return repo.save(employee);
	}
 
	@Override
	public void removeEmployee(Employee employee) {
		
		 repo.delete(employee);
	}

	@Override
	public List<Employee> getAllEmployees()   {
		List<Employee> employee = repo.findAll();
		return employee;
	}
	

}
