<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista dos Produtos</title>
</head>
<body>
	<p>Listagem de Produtos</p>
	
	<p><a href="produtos/form">Adicionar novo</a></p>	
	
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Nome Produto</th>
				<th>Validade Produto</th>
				<th>Temperatura Recomendada</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="produto" items="${produtos}">
				<tr>
					<td>${produto.idProduto}</td>
					<td>${produto.nomeProduto}</td>
					<td>${produto.validadeProduto}</td>
					<td>${produto.temperaturaRecomendada}</td>					
					<td><a href="produtos/${produto.idProduto}">Editar</a></td>
					<td><a href="produtos/${produto.idProduto}/delete">Deletar</a></td>
				</tr>
			</c:forEach>
		</tbody>
		
		
	</table>
</body>
</html>