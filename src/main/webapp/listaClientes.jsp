<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.github.lucasdevrj.cadastrase.cliente.Cliente" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Lista de Cadastros</title>
	</head>
	
	<body>
		<h2>Lista de Cadastros</h2>
		<ul>
			<c:forEach items="${clientes}" var="cliente">
				<li>
					<p>Nome: ${cliente.nome}</p>
					<p>Sobrenome: ${cliente.sobrenome}</p>
					<p>E-mail: ${cliente.email}</p>
				</li>
			</c:forEach>
		</ul>
	</body>
</html>