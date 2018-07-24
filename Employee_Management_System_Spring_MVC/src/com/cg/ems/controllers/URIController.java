package com.cg.ems.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.ems.beans.Employee;
import com.cg.ems.service.EmployeeService;

import antlr.collections.List;



@Controller
public class URIController {

	@RequestMapping(value="/")
	public String getIndexPage() {
		return "indexPage";
	}

	@RequestMapping(value="/login")
	public String getLoginPage() {
		return "loginPage";
	}

	
	@RequestMapping(value="/registration")
	public String getRegisterationPage() {
		return "registrationPage";
	}
	@RequestMapping(value="/getAll")
	public String getAllEmp() {
		return "getAllPage";
	}

	@RequestMapping(value="/yes")
	public String getDet() {
		return "yesPage";
	}

	@RequestMapping(value="/no")
	public String noDet() {
		return "noPage";
	}
	@ModelAttribute("employee")
	public Employee getCustomer() {
		return new Employee();
	}
}
