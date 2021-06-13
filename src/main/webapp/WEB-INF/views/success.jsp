<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inserted Data!</title>
</head>
<body>
	${Header }
	<h1>Welcome, ${user.name }</h1>
	<h1>Your email address is ${user.email }</h1>
</body>
</html>