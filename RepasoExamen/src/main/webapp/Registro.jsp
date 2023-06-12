<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ page
	language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario de Registro</title>
<link href="${pageContext.request.contextPath}/css/form.css"
	rel="stylesheet" type="text/css">
</head>
<body>
	<fieldset>

		<legend class="legend">Registro</legend>
		<form action="${pageContext.request.contextPath}/Controlador"
			method="post">

			<select name="listaequipos">
				<c:forEach items="${listadoequipos}" var="Clubes">
					<option value="${Clubes.teamId}">${Clubes.teamName}</option>
				</c:forEach>
			</select>

			<div class="form-group">
				<label for="name">Usuario:</label> <input type="text" id="name"
					name="usuario" required>
			</div>
			<div class="form-group">
				<label for="contra">Contraseña:</label> <input type="password"
					id="contra" name="contrasenia" required>
			</div>

			<input type="hidden" name="operacion" value="registrousuarios">
			<input type="submit" name="guardar" value="Enviar">
			<h4>${correcto}</h4>
		<h4>${error}</h4>
		</form>
	</fieldset>
</body>
</html>