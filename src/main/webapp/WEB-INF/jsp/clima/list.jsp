<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista dos Climas</title>
</head>
<body>
	<p>Listagem de Climas</p>
	
	<p><a href="clima/form">Adicionar novo</a></p>	
	
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Nome Clima</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="clima" items="${climas}">
				<tr>
					<td>${clima.idClima}</td>
					<td>${clima.nomeClima}</td>
					<td><a href="clima/${clima.idClima}">Editar</a></td>
					<td><a href="clima/${clima.idClima}/delete">Deletar</a></td>
				</tr>
			</c:forEach>
		</tbody>
		
		
	</table>
</body>
</html>