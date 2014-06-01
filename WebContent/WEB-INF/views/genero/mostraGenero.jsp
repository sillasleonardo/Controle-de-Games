<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Controle - Games</title>
</head>
<body>
	<h3>Atualização de Genero - Controle de Games</h3>
	<form action="alteraGenero" method="post">
	<input type="hidden" name="gen_id" value="${genero.gen_id}"/>
		<table>
			<tr>
				<td>
					Nome:
				</td>
				<td>
					<input type="text" name="gen_nome" value="${genero.gen_nome}" />
				</td>
			</tr>
			<tr>
				<td>
					Descrição:
				</td>
				<td>
					<input type="text" name="gen_descricao" value="${genero.gen_descricao}"/>
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="Alterar" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>