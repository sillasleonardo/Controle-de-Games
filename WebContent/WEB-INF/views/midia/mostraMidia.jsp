<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Controle - Games</title>
</head>
<body>
	<h3>Atualização de Midia - Controle de Games</h3>
	<form action="alteraMidia" method="post">
	<input type="hidden" name="mid_id" value="${midia.mid_id}"/>
		<table>
			<tr>
				<td>
					Nome: 
				</td>
				<td>
					<input type="text" name="mid_nome" value="${midia.mid_nome}" />
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