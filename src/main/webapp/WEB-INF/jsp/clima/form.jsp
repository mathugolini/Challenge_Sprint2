<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Adicionar Clima</title>
</head>
<body>
	<c:url var="save_clima_url" value="clima/save"/>
	<form:form action="${save_clima_url}" method="post" modelAttribute="clima">
	
	  <form:label path="idClima">Id:</form:label><br>
	  <form:input type="text" path="idClima" readonly="true"/><br>
	  
	  <form:label path="nomeClima">Nome Clima:</form:label><br>
	  <form:input type="text" path="nomeClima"/><br>
	  
	  <input type="submit" name="salvar" value="Salvar"/>
	</form:form>

</body>
</html>