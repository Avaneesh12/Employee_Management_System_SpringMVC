package com.cg.ems.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.ems.beans.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
