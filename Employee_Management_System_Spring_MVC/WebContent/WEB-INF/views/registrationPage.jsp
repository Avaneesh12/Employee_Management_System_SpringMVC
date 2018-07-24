<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<style>
.error {
	color: red;
	font-weight: bold;
}

table {
    border-collapse: collapse;
}

td {
    padding-top: .5em;
    padding-bottom: .5em;
}
</style>
</head>
<body>
	<div align="center">
		<h1>Welcome to Registration Page</h1>
		<table>
			<form:form action="registerEmployee" method="post" modelAttribute="employee">
				<tr>
					<td>Employee Name :</td>
					<td><form:input path="employeeName" size="30" /></td>
					<td><form:errors path="employeeName" cssClass="error" /></td>
				</tr>

				<tr>
					<td>Employee Salary :</td>
					<td><form:input path="Salary" size="30" /></td>
					<td><form:errors path="Salary" cssClass="error" /></td>
				</tr>

				<tr>
					<td>Employee Department Name :</td>
					<td><form:input path="departmentName" size="30" /></td>
					<td><form:errors path="departmentName" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Employee Date of Joining :</td>
					<td><form:input type="date" path="dateOfJoining" size="30" /></td>
					<td><form:errors path="dateOfJoining" cssClass="error" /></td>
				</tr>
				
				<tr>
					<td></td>
					<td><input type="submit" value="submit"/></td>
				</tr>
			</form:form>
		</table>


	</div>
</body>
</html>