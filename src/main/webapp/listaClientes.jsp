<%@page import="javax.swing.plaf.metal.MetalBorders.Flush3DBorder"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.github.lucasdevrj.cadastrase.cliente.Cliente" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/index.jsp" var="paginaPrincipal"/>

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
				<c:if test="${not empty clientes}">
					<c:forEach items="${clientes}" var="cliente">
					<li class="cliente-informacoes">
						<p>Nome: ${cliente.nome}</p>
						<p>Sobrenome: ${cliente.sobrenome}</p>
						<p>E-mail: ${cliente.email}</p>
						<a href="/cadastra-se/removeCliente?identificador=${cliente.identificador}">&#10060;</a>
					</li>
					<hr>
					</c:forEach>
				</c:if>
				
				<c:if test="${empty clientes}">
					<h3 class="lista-mensagem">Lista está vázia!!</h3>
				</c:if>
			</ul>
			
			<p class="link">
				<a href="${paginaPrincipal}">Voltar</a>
			</p>
		</main>
		
		<footer class="rodape">
			<a href="https://github.com/LucasDevRJ" target="blank">
				<img alt="Logo do GitHub" src="imagens/github-logo.png">
			</a>
		</footer>
	</body>
</html>