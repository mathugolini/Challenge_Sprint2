<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Adicionar Modelo Caminhao</title>
</head>
<body>
	<c:url var="save_modelo_caminhao_url" value="modeloCaminhao/save"/>
	<form:form action="${save_modelo_caminhao_url}" method="post" modelAttribute="modeloCaminhao">
	
	  <form:label path="idModeloCaminhao">Id:</form:label><br>
	  <form:input type="text" path="idModeloCaminhao" readonly="true"/><br>
	  
	  <form:label path="nomeModeloCaminhao">Nome do Modelo:</form:label><br>
	  <form:input type="text" path="nomeModeloCaminhao"/><br>
	  
	  <input type="submit" name="salvar" value="Salvar"/>
	</form:form>

</body>
</html>