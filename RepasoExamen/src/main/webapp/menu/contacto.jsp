<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contacto</title>
<link href="${pageContext.request.contextPath}/css/contacto.css"
	rel="stylesheet" type="text/css">
</head>
<body>
	<form action="datoscontacto.jsp" method="post">
		<h1>Formulario de contacto</h1>
		<label for="nombre">Nombre:</label>
		<input type="text" id="nombre" name="nombre" required>
		
		<label for="email">Email:</label>
		<input type="text" id="email" name="email" required>

		<label for="mensaje">Mensaje:</label>
		<textarea id="mensaje" name="mensaje" required></textarea>
		
		<input type="submit" value="Enviar">
	</form>
</body>
</html>