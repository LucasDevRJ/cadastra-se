<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/index.jsp" var="paginaPrincipal"/>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="reset.css">
		<link rel="stylesheet" type="text/css" href="style.css">
	</head>
	
	<body>
		<header class="cabecalho">
			<h1>Cadastra-se</h1>
		</header>
	
		<h2>Olá ${nome}!!</h2>
		<h3>Obrigado pela confiança!!!</h3>
		<p><a href="${paginaPrincipal}">Voltar</a></p>
	</body>
</html>