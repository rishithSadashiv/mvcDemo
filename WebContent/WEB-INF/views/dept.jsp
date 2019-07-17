<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dept page</title>
</head>
<body>
	<h1>Dept Maint</h1>
	
	<p> Welcome ${sessionScope.USER_NAME}</p><%-- ${USER_NAME} is in request scope, ${sessionScope.USER_NAME} is in session scope --%>
	
	<%-- <form action="dept.html" method ="post">
		<input type="text" name="deptId"/><br/>
		<input type="text" name="deptName"/><br/>
		<input type="submit" name="Create"/>
	
	</form> --%>
	
	<form:form action="dept.html" method="post">
		<form:input path="deptId"/><br/>
		<form:input path="deptName"/><br/>
		<input type="submit" value="Create">
		
	</form:form>
	
	<hr/>
	<table border="1">
		<thead>
			<tr>
				<td>Dept ID</td>
				<td>Dept Name</td>
			</tr>
		</thead>
		
		<c:forEach items="${DEPT_LIST}" var="dept">
			<tr>
				<td> <c:out value="${dept.deptId}"></c:out> </td>
				<td> <c:out value="${dept.deptName}"></c:out> </td>
			</tr>
		</c:forEach>
	
	</table>
	
	
</body>
</html>