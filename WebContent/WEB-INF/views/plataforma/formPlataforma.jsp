<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Controle - Games</title>
</head>
<body>
	
	<h3>Cadastro de Plataforma - Controle de Games</h3>
	<form action="adicionaPlataforma" method="post">
		<table>
			<tr>
				<td>
					Nome:
				</td>
				<td>
					<input type="text" name="pla_nome">
				</td>		
			</tr>
			<tr>
				<td>
					Descri��o:
				</td>
				<td>
					<input type="text" name="pla_descricao">
				</td>		
			</tr>
			<tr>
				<td>
					<input type="submit" value="Gravar" />
				</td>		
			</tr>
		</table>
	</form>
</body>
</html>