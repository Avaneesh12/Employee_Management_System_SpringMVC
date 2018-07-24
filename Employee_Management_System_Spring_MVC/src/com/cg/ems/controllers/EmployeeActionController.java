package com.cg.ems.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.ems.beans.Employee;
import com.cg.ems.service.EmployeeService;

import java.util.*;



@Controller
public class EmployeeActionController 
{

	@Autowired
	EmployeeService employeeService;
	

	public int generateEmployeeID()
	{
		double rndDouble = Math.random();
		return (int) (rndDouble * 1000);
	}
	@RequestMapping(value="/registerEmployee")
	public ModelAndView registeremployee(@Valid @ModelAttribute("employee") Employee employee,BindingResult result) {
		int employeeID = generateEmployeeID();
		try {
			if(result.hasErrors()) return new ModelAndView("registrationPage");
			employee.setEmployeeID(employeeID);
			employee=employeeService.addEmployee(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ModelAndView("registrationSuccessPage","employee",employee);

	}
	
	@RequestMapping(value="/getEmployee")
	public ModelAndView getCustomer(@ModelAttribute("employee") Employee employee,BindingResult result) {
		
		try {
			if(result.hasErrors()) return new ModelAndView("loginPage");
			employee=employeeService.getEmployee(employee.getEmployeeID());
		} catch (Exception e) {
			e.printStackTrace();
		}

      if(employee==null)
    	  return new ModelAndView("loginFailPage","employee",employee);

		return new ModelAndView("loginSuccessPage","employee",employee);

	}
	@RequestMapping(value="/getAllEm")
	public ModelAndView allEmp() {
		
		List<Employee> list1 = employeeService.getAllEmployees();
		System.out.println(list1);
		ModelAndView mv = new ModelAndView("yesPage");
		
		mv.addObject("listssss",list1);
		return mv;

	}
	
}
