<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.github.lucasdevrj.cadastrase.cliente.Cliente" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Lista de Cadastros</title>
		<link rel="stylesheet" type="text/css" href="reset.css">
		<link rel="stylesheet" type="text/css" href="style.css">
		<link rel="stylesheet" type="text/css" href="lista.css">
	</head>
	
	<body>
		<header class="cabecalho">
			<h1>Cadastra-se</h1>
		</header>
		
		<main class="lista">
			<h2 class="titulo">Lista de Cadastros</h2>
			<ul class="lista-cliente">
				<c:forEach items="${clientes}" var="cliente">
					<li>
						<p>Nome: ${cliente.nome}</p>
						<p>Sobrenome: ${cliente.sobrenome}</p>
						<p>E-mail: ${cliente.email}</p>
					</li>
				</c:forEach>
			</ul>
		</main>
		
		<footer class="rodape">
			<a href="https://github.com/LucasDevRJ" target="blank">
				<img alt="Logo do GitHub" src="imagens/github-logo.png">
			</a>
		</footer>
	</body>
</html>