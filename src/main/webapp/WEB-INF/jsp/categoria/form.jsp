<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Adicionar Categoria</title>
</head>
<body>
	<c:url var="save_categorio_url" value="categorias/save"/>
	<form:form action="${save_categorio_url}" method="post" modelAttribute="categoria">
	
	  <form:label path="idCategoria">Id:</form:label><br>
	  <form:input type="text" path="idCategoria" readonly="true"/><br>
	  
	  <form:label path="nomeCategoria">Nome Categoria:</form:label><br>
	  <form:input type="text" path="nomeCategoria"/><br>
	  
	  <input type="submit" name="salvar" value="Salvar"/>
	</form:form>

</body>
</html>