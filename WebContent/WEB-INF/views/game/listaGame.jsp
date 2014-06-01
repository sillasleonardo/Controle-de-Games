<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<a href="novoGame">Criar novo Game</a>
	<br /><br />
	<table border="1">
		<tr>
			<td>Código</td>
			<td>Nome</td>
			<td>Lançamento</td>
			<td>Descrição</td>
			<td>Capa</td>
			<td>Genero</td>
			<td>Midia</td>
			<td>Plataforma</td>
			<td colspan="2" align="center">Acões</td>
		</tr>
		
		<c:forEach var="game" items="${game}">
			<tr>
				<td>${game.game_id}</td>
				<td>${game.game_nome}</td>
				<td>
					<fmt:formatDate value="${game.game_data.time}"
									pattern="dd/MM/yyyy"/>
				</td>
				<td>${game.game_descricao}</td>
				<td>${game.game_capa}</td>
				<td>${game.gen.gen_nome}</td>
				<td>${game.mid.mid_nome}</td>
				<td>${game.pla.pla_nome}</td>
				<td>
					<a href="mostraGame?game_id=${game.game_id}">Alterar</a>
				</td>
				<td>
					<a href="removeGame?game_id=${game.game_id}">Remover</a>
				</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>