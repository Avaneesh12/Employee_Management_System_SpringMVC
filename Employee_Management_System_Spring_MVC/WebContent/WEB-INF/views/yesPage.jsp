<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<tr>
			<th colspan="4">Employee Details</th>
		</tr>
		<tr>
			<th>Employee ID</th>
			<th>Employee Name</th>
			<th>Employee Department</th>
			<th>Employee DOJ</th>
		</tr>

		<c:forEach items="${listssss}" var="empl">
			<tr>
				<td>${empl.employeeID}</td>
				<td>${empl.employeeName}</td>
				<td>${empl.departmentName}</td>
				<td>${empl.dateOfJoining}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>