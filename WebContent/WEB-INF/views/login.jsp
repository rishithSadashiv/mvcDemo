<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Login Page</h1>
	
	<c:if test="${param.ERROR != null }">
		<p><c:out value="${param.ERROR}"/>
	</c:if>
	
	<form action="login.html" method="post">
		<input name="userName" type="text"/><br/>
		<input name="password" type="password"/><br/>
		<input type="Submit" value="Login"/>
		
	</form>
</body>
</html>