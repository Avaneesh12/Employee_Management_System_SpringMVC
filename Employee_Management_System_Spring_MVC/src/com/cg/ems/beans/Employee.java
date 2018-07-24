package com.cg.ems.beans;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.crypto.Data;

@Entity
@Table(name="Employee")
public class Employee implements Serializable 
{
	private static final long serialVersionUID = -3951913381135115940L;
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Pattern(regexp="(^$|[0-9]{10})")
//	@Size(min=1,max=5)
//	@Column(name="empId")
	private int employeeID;
	
	@Column(name="empName")
	private String employeeName;
	
	//@Column(name="Salary")
	private double Salary;
	
	@Column(name="department")
	private String departmentName;
	
	@Column(name="doj")
	private Date dateOfJoining;


	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeID + ", employeeName=" + employeeName + ", Salary=" + Salary
				+ ", departmentName=" + departmentName + ", dateOfJoining=" + dateOfJoining + "]";
	}
	
	

}
