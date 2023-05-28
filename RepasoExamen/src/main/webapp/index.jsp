<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
//Redireccion a la pagina de inicio donde se encuentra el formulario
<jsp:scriptlet>response.sendRedirect("Controlador?operacion=home");</jsp:scriptlet>
</body>
</html>