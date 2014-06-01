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
	<h3>Lista de Plataformas - Controle de Games</h3>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>Plataforma</td>
			<td>Descrição</td>
			<td colspan="2" align="center">Ações</td>
		</tr>
		<c:forEach var="plataforma" items="${plataforma}">
			<tr>
				<td>${plataforma.pla_id}</td>
				<td>${plataforma.pla_nome}</td>
				<td>${plataforma.pla_descricao}</td>
				<td>
					<a href="mostraPlataforma?pla_id=${plataforma.pla_id}">Alterar</a>
				</td>
				<td>
					<a href="removePlataforma?pla_id=${plataforma.pla_id}">Remover</a>
				</td>
			</tr>	
		</c:forEach>
	</table>
</body>
</html>