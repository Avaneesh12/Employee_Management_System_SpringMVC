<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<style type="text/css">
a{
	text-decoration: none;
}
</style>
</head>
<body>
<div align="center">
<h2>Welcome ${employee.employeeName }</h2><br>
<p>  You have successfully registered with Employee ID : ${employee.employeeID } </p> 
To get the employee details <a href="./login"> Click Here!!</a>
</div>
</body>
</html>