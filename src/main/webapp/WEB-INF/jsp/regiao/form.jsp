<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Adicionar Regiao</title>
</head>
<body>
	<c:url var="save_regiao_url" value="regiao/save"/>
	<form:form action="${save_regiao_url}" method="post" modelAttribute="regiao">
	
	  <form:label path="idRegiao">Id:</form:label><br>
	  <form:input type="text" path="idRegiao" readonly="true"/><br>
	  
	  <form:label path="nomeEstado">Estado:</form:label><br>
	  <form:input type="text" path="nomeEstado"/><br>
	  
	  <form:label path="nomePais">País:</form:label><br>
	  <form:input type="text" path="nomePais"/><br>
	  
	  <input type="submit" name="salvar" value="Salvar"/>
	</form:form>

</body>
</html>