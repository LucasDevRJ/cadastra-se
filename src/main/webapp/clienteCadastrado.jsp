<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%
	String nome = (String) request.getAttribute("name");
	String sobrenome = (String) request.getAttribute("sobrenome");
	String email = (String) request.getAttribute("email");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="style.css">
	</head>
	
	<body>
		<h2>Ol� <%=nome %>!!</h2>
		<h3>Obrigado pela confian�a!!!</h3>
	</body>
</html>