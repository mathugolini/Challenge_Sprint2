<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista das Regiões</title>
</head>
<body>
	<p>Listagem de Regiões</p>
	
	<p><a href="regiao/form">Adicionar novo</a></p>	
	
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Estado</th>
				<th>País</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="r" items="${regiao}">
				<tr>
					<td>${r.idRegiao}</td>
					<td>${r.nomeEstado}</td>
					<td>${r.nomePais}</td>
					<td><a href="regiao/${r.idCategoria}">Editar</a></td>
					<td><a href="regiao/${r.idCategoria}/delete">Deletar</a></td>
				</tr>
			</c:forEach>
		</tbody>
		
		
	</table>
</body>
</html>