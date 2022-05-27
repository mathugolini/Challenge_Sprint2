<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Adicionar Produto</title>
</head>
<body>
	<c:url var="save_produto_url" value="produtos/save"/>
	<form:form action="${save_produto_url}" method="post" modelAttribute="produto">
	
	  <form:label path="idProduto">Id:</form:label><br>
	  <form:input type="text" path="idProduto" readonly="true"/><br>
	  
	  <form:label path="nomeProduto">Nome Produto:</form:label><br>
	  <form:input type="text" path="nomeProduto"/><br>
	  
	  <form:label path="validadeProduto">Validade Produto:</form:label><br>
	  <form:input type="text" path="validadeProduto"/><br>
	  
	  <form:label path="temperaturaRecomendada">Temperatura Recomendada:</form:label><br>
	  <form:input type="text" path="temperaturaRecomendada"/><br>
	  
	  <input type="submit" name="salvar" value="Salvar"/>
	</form:form>

</body>
</html>