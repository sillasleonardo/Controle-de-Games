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
	<h3>Lista de Midias - Controle de Games</h3>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>Midia</td>
			<td colspan="2" align="center">Ações</td>
		</tr>
		<c:forEach var="midia" items="${midia}">
			<tr>
				<td>${midia.mid_id}</td>
				<td>${midia.mid_nome}</td>
				<td>
					<a href="mostraMidia?mid_id=${midia.mid_id}">Alterar</a>
				</td>
				<td>
					<a href="#">Remover</a>
				</td>
			</tr>	
		</c:forEach>
	</table>
</body>
</html>