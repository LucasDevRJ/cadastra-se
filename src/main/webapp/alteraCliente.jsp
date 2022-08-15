<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<c:url value="/alteraCliente" var="alterado"/>

<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="ISO-8859-1">
		<title>Cadastra-se</title>
		<link rel="stylesheet" type="text/css" href="reset.css">
		<link rel="stylesheet" type="text/css" href="style.css">
	</head>
	
	<body>
	
		<header class="cabecalho">
			<h1>Cadastra-se</h1>
		</header>
	
		<form class="formulario" action="${alterado}" method="post">
			
			<label for="nome" class="formulario-texto">Nome:</label>
			<input type="text" name="nome" class="entrada" value="${cliente.nome}">
					
			<label for="sobrenome" class="formulario-texto">Sobrenome:</label>
			<input type="text" name="sobrenome" class="entrada" value="${cliente.sobrenome}">
					
			<label for="email" class="formulario-texto">E-mail:</label>
			<input type="email" name="email" class="entrada" value="${cliente.email}">
			
			<input type="submit" value="Alterar" class="formulario-botao">
		</form>
		
		<footer class="rodape">
			<a href="https://github.com/LucasDevRJ" target="blank">
				<img alt="Logo do GitHub" src="imagens/github-logo.png">
			</a>
		</footer>
	</body>
</html>