<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista dos Climas Mes</title>
</head>
<body>
	<p>Listagem de Clima Mes</p>
	
	<p><a href="climaMes/form">Adicionar novo</a></p>	
	
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Mes</th>
				<th>Ano</th>
				<th>Temperatura Média</th>
				<th>Umidade</th>
				<th>Precipitação</th>
				<th>Tempo Predominante</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="cm" items="${climaMes}">
				<tr>
					<td>${cm.idClimaMes}</td>
					<td>${cm.mes}</td>
					<td>${cm.ano}</td>
					<td>${cm.temperaturaMedia}</td>
					<td>${cm.umidade}</td>
					<td>${cm.precipitacao}</td>
					<td>${cm.tempoPredominante}</td>
					<td><a href="climaMes/${cm.idClimaMes}">Editar</a></td>
					<td><a href="climaMes/${cm.idClimaMes}/delete">Deletar</a></td>
				</tr>
			</c:forEach>
		</tbody>
		
		
	</table>
</body>
</html>