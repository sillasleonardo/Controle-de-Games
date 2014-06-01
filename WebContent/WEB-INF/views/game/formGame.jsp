<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="resources/css/jquery.css" rel="stylesheet">
<script src="resources/js/jquery.js"></script>
<script src="resources/js/jquery-ui.js"></script>
<title>Controle - Games</title>
<style type="text/css">
  	.capa {
    	width: 220px; 
    	height: 150px; 
    	border: 2px; 
    	border-color: black; 
    	border-style:solid;
    	border-radius: 10px;
	}
  </style>
</head>
<body>
<div style="border: solid 1px red; width:500px; ">
	<form action="adicionaGame" method="post">
	<div style="border: solid 0px red;">
		<div style	="border: solid 0px red;">
			<table>
				<tr style="border: solid 0px;">
					<td style="vertical-align: top; padding: 10px; border: solid 0px; height: 100px;">
						<label>
							Código
						</label>
						<div>
							<input type="text" name="game_id" readonly/>
						</div>
						<label>
							Nome
						</label>
						<div>
							<input type="text" name="game_nome" />
						</div>
						<label>
							Data
						</label>
						<div>
							<input type="text" name="game_data" id="calendario"/>
						</div>
						<label>
							Genero:
						</label>
						<select name="gen">
							<option>Selecione...</option>
							<c:forEach var="gen" items="${gen}">
								<option value="${gen.gen_id}">
									${gen.gen_nome}
								</option>
							</c:forEach>
						</select>
						<br />
					</td>
					<td style="vertical-align: top; padding: 10px; border: solid 0px; height: 100px;">
						<table>
							<tr>
								<td style="border solid: 0px;">
									<div class="capa">
										<img alt="capa" src="" id="arquivo"/>
									</div>
									<input type="file" name="game_capa" onchange="readURL(this);"/>
								</td>	
							</tr>
							<tr style="height: 13px; border: solid 0px;"></tr>
							<tr>
								<td>
									<div>
										Mídia
										<select name="mid" id="midia">
											<option>Selecione...</option>
											<c:forEach var="midia" items="${midia}">
												<option value="${midia.mid_id}">
													${midia.mid_nome}
												</option>
											</c:forEach>
										</select>
									</div>
									<div>
										Plataforma
										<select name="pla" id="plataforma">
											<option>Selecione...</option>
											<c:forEach var="plataforma" items="${plataforma}">
												<option value=" ${plataforma.pla_id}">
													${plataforma.pla_nome}
												</option>
											</c:forEach>
										</select>
									</div>	
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			<table>
				<tr style=" border: solid 0px;">
					<td style="vertical-align: top; padding: 10px; border: solid 0px; height: 100px;">
						<div style="width:478px;  height:100px; border: solid 0px;">
							<label>Descrição</label>
							<textarea name="game_descricao" rows="3" cols="5" style="width:460px;  height:50px; border: solid 1px #27408B;"></textarea>
						</div>
					</td>
				</tr>
			</table>
		</div>
	</div>
	<div>
		<div style="float: left; width: 220px; height: 45px; border: solid 0px;">
			<div align="right">
				<input type="submit" value="Enviar" />
			</div>
		</div>

		<div style="float: left; width: 220px; height: 45px; border: solid 0px;"><!-- right -->
			<div align="left">
				<a href="../views/index.jsp"> <input type="button"
					value="Voltar" />
				</a>
			</div>
		</div>
	</div>
	</form>
</div>
<script>
    $("#calendario").datepicker({changeMonth: true, changeYear: true,
	    dateFormat: 'dd/mm/yy',
	    dayNames: ['Domingo','Segunda','Terça','Quarta','Quinta','Sexta','Sábado','Domingo'
	        ],
	    dayNamesMin: [
	    'D','S','T','Q','Q','S','S','D'
	    ],
	    dayNamesShort: [
	    'Dom','Seg','Ter','Qua','Qui','Sex','Sáb','Dom'
	    ],
	    monthNames: [  'Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto','Setembro',
	    'Outubro','Novembro','Dezembro'
	    ],
	    monthNamesShort: [
	    'Jan','Fev','Mar','Abr','Mai','Jun','Jul','Ago','Set',
	    'Out','Nov','Dez'
	    ],
	    nextText: 'Próximo',
	    prevText: 'Anterior'
 });
</script>	
</body>
</html>