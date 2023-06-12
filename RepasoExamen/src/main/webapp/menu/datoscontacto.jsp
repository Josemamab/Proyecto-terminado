<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ page
	language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/contacto.css" />
</head>
<body>
	<div>
		<h1>Formulario procesado</h1>
		<%
		String nombre = request.getParameter("nombre");
		String email = request.getParameter("email");
		String mensaje = request.getParameter("mensaje");
		String error = "";
		boolean validado = false;
		%>

	</div>
</body>
</html>