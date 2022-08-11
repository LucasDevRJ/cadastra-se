<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.github.lucasdevrj.cadastrase.cliente.Cliente" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Lista de Cadastros</title>
	</head>
	
	<body>
		<ul>
			<%
				List<Cliente> lista = (List<Cliente>) request.getAttribute("clientes");
				
			%>
		</ul>
	</body>
</html>