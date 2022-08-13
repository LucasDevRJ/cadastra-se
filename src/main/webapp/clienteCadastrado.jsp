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
		<link rel="stylesheet" type="text/css" href="cadastrado.css">
	</head>
	
	<body>
		<header class="cabecalho">
			<h1>Cadastra-se</h1>
		</header>
	
		<main class="principal">
			<h2 class="titulo">Ol� ${nome}!!</h2>
			<h3 class="subtitulo">Obrigado pela confian�a!!!</h3>
			<p><a href="${paginaPrincipal}">Voltar</a></p>
		</main>
		
		<footer class="rodape">
			<a href="https://github.com/LucasDevRJ" target="blank">
				<img alt="Logo do GitHub" src="imagens/github-logo.png">
			</a>
		</footer>
	</body>
</html>