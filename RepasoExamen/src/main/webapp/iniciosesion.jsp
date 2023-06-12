<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario de inicio de sesión</title>
<link href="${pageContext.request.contextPath}/css/form.css"
	rel="stylesheet" type="text/css">
</head>
<body>
	<fieldset>
		<legend class="legend">Inicio de Sesión</legend>
	<form action="${pageContext.request.contextPath}/Controlador" method="post">


			<div class="form-group">
				<label for="name">Usuario:</label> <input type="text" id="name"
					name="name" required>
			</div>
			<div class="form-group">
				<label for="contra">Contraseña:</label> <input type="password"
					id="contra" name="contra" required>
			</div>
		
		<input type="hidden" name="operacion" value="iniciarsesion">
		<input type="submit" name="guardar" value="Enviar">
		
		<h4>${error}</h4>	
	</form>
	</fieldset>
</body>
</html>