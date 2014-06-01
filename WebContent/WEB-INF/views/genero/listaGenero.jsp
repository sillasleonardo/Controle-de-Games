<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Controle de Games</title>
</head>
<body>
	<h3>Lista de Generos - Controle de Games</h3>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>Genero</td>
			<td>Descrição</td>
			<td colspan="2" align="center">Ações</td>
		</tr>
		<c:forEach var="genero" items="${genero}">
			<tr>
				<td>${genero.gen_id}</td>
				<td>${genero.gen_nome}</td>
				<td>${genero.gen_descricao}</td>
				<td>
					<a href="mostraGenero?gen_id=${genero.gen_id}">Alterar</a>
				</td>
				<td>
					<a href="removeGenero?gen_id=${genero.gen_id}">Remover</a>
				</td>
			</tr>	
		</c:forEach>
	</table>
</body>
</html>