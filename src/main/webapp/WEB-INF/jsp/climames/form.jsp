<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Adicionar Clima Mes</title>
</head>
<body>
	<c:url var="save_clima_mes_url" value="climaMes/save"/>
	<form:form action="${save_clima_mes_url}" method="post" modelAttribute="climaMes">
	
	  <form:label path="idClimaMes">Id:</form:label><br>
	  <form:input type="text" path="idClimaMes" readonly="true"/><br>
	  
	  <form:label path="mes">Mes:</form:label><br>
	  <form:input type="text" path="mes"/><br>
	  
	  <form:label path="ano">Ano:</form:label><br>
	  <form:input type="text" path="ano"/><br>
	  
	  <form:label path="temperaturaMedia">Temperatura Média:</form:label><br>
	  <form:input type="text" path="temperaturaMedia"/><br>
	  
	  <form:label path="umidade">Umidade:</form:label><br>
	  <form:input type="text" path="umidade"/><br>
	  
	  <form:label path="precipitacao">Precipitação:</form:label><br>
	  <form:input type="text" path="precipitacao"/><br>
	  
	  <form:label path="tempoPredominante">Tempo Predominante:</form:label><br>
	  <form:input type="text" path="tempoPredominante"/><br>
	  
	  <input type="submit" name="salvar" value="Salvar"/>
	</form:form>

</body>
</html>