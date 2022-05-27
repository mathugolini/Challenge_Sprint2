<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista dos Relevos</title>
</head>
<body>
	<p>Listagem de Relevos</p>
	
	<p><a href="relevos/form">Adicionar novo</a></p>	
	
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Nome Relevo</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="relevo" items="${relevos}">
				<tr>
					<td>${relevo.idRelevo}</td>
					<td>${relevo.tipoRelevo}</td>
					<td><a href="relevos/${relevo.idRelevo}">Editar</a></td>
					<td><a href="relevos/${relevo.idRelevo}/delete">Deletar</a></td>
				</tr>
			</c:forEach>
		</tbody>
		
		
	</table>
</body>
</html>