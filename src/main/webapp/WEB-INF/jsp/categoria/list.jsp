<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista das Categorias</title>
</head>
<body>
	<p>Listagem de Categorias</p>
	
	<p><a href="categorias/form">Adicionar novo</a></p>	
	
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Nome Categoria</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="categoria" items="${categorias}">
				<tr>
					<td>${categoria.idCategoria}</td>
					<td>${categoria.nomeCategoria}</td>
					<td><a href="categorias/${categoria.idCategoria}">Editar</a></td>
					<td><a href="categorias/${categoria.idCategoria}/delete">Deletar</a></td>
				</tr>
			</c:forEach>
		</tbody>
		
		
	</table>
</body>
</html>