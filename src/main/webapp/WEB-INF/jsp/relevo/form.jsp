<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Adicionar Relevo</title>
</head>
<body>
	<c:url var="save_relevo_url" value="relevos/save"/>
	<form:form action="${save_relevo_url}" method="post" modelAttribute="relevo">
	
	  <form:label path="idRelevo">Id:</form:label><br>
	  <form:input type="text" path="idRelevo" readonly="true"/><br>
	  
	  <form:label path="tipoRelevo">Nome Relevo:</form:label><br>
	  <form:input type="text" path="tipoRelevo"/><br>
	  
	  <input type="submit" name="salvar" value="Salvar"/>
	</form:form>

</body>
</html>