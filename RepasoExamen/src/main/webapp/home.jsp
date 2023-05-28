<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ page
	language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/css/estilos.css"
	rel="stylesheet" type="text/css">
</head>

<body>
	<header>
		<div class="logo">
			<img src="ruta-de-la-imagen" alt="Logo de la página" />
		</div>
		<div class="user-box">
			<a href="${pageContext.request.contextPath}/InicioSesion.jsp">Iniciar sesión</a> 
			
			
			<a href="#">Registrarse</a>
		</div>
	</header>
	<nav>
		<a
			href="${pageContext.request.contextPath}/Controlador?operacion=Clubes">Clubes</a>
		<a
			href="${pageContext.request.contextPath}/Controlador?operacion=Jugadores">Jugadores</a>
		<a href=""></a> <a href=""></a>
	</nav>

	<div class="Cuerpopagina">
		<div class="ultimasnoticias"></div>

		<div class="ultimospartidos">
			<form action="${pageContext.request.contextPath}/Controlador"
				method="post">
				<fieldset>
					<legend align="left">Proximas Jornadas</legend>
					<table border=1>
						<tr>
							<th>LOCAL</th>
							<th>MATCHDATE</th>
							<th>VISITANTE</th>
						</tr>
						<c:forEach items="${proximospartidos}" var="Jornadas">

							<tr>

								<td>${Jornadas.local}</td>
								<td>${Jornadas.matchDate}</td>
								<td>${Jornadas.visitante}</td>
							</tr>
						</c:forEach>
					</table>

				</fieldset>
			</form>
		</div>

	</div>
	<footer> </footer>
</body>
</html>