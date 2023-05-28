<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="${pageContext.request.contextPath}" method="post">


	{error}
		Usuario<input type="text" name="usuario" value=""> <br>
		Contraseña <input type="password" name="password" value="">
		
		<br> 
		
		<input type="hidden" name="operacion" value="iniciarsesion">
		<input type="submit" name="guardar" value="Enviar">
		
		<h4>${error}</h4>	
	</form>
</body>
</html>