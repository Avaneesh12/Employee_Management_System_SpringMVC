<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
<center>
<pre>
	
		<h2> Welcome Name                   : ${employee.employeeName }   </h2>
		<h2> Name                           : ${employee.employeeName}    </h2>
		<h2> Department Name                : ${employee.departmentName}  </h2>
		<h2> Date Of Joining(YYYY-MM-DD)    : ${employee.dateOfJoining}   </h2>
		<%-- <h2> Salary             : ${employee.Salary }         </h2> --%>
		
		<p>Go to home page <a href="./">Click Here!</a>
	</pre>
	<pre>
	
	
	Would you like to know the details of all employees?	<a href="getAll">All Employee Details</a>
	
	</pre>
	</center>
</body>
</html>