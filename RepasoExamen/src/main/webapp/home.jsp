<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ page
	language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mi página web</title>
<link href="${pageContext.request.contextPath}/css/styles.css"
	rel="stylesheet" type="text/css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" />
<script src="${pageContext.request.contextPath}/js/carrusel.js"></script>
</head>

<body>

	<header class="header">
		<div class="header__logo">
			<img src="imagenes/lfp.jpg" alt="Logo de la página" class="header__logo img"/>
		</div>
		<c:if test="${iniciarsesion==null}">
			<div class="header__sesion">
			<img src="imagenes/laliga.jpg" alt="Imagen adicional" class="additional-image"/>
				<a href="${pageContext.request.contextPath}/iniciosesion.jsp">Iniciar
					sesión</a> <a
					href="${pageContext.request.contextPath}/Controlador?operacion=listaequipos">Registrarse</a>
			</div>
		</c:if>


		<c:if test="${iniciarsesion!=null}">
			<h4>${iniciarsesion}</h4>

			<a
				href="${pageContext.request.contextPath}/Controlador?operacion=home">Cerrar
				sesión</a>
		</c:if>
	</header>

	<nav class="nav">
		<ul class="nav__list">
			<li class="nav__item"><a href="#">Inicio</a></li>
			<li class="nav__item"><a href="menu/nosotros.jsp">Acerca de nosotros</a></li>
			<li class="nav__item"><a href="menu/contacto.jsp">Contacto</a></li>
			<li class="nav__item"><a
				href="${pageContext.request.contextPath}/Controlador?operacion=Clubes">Clubes</a></li>

		</ul>
	</nav>

	<section class="main-content">
		<div class="main-content__left-column">
			<h2 class="main-content__jornadas">Proximas Jornadas</h2>
			<form action="${pageContext.request.contextPath}/Controlador"
				method="post">

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
			</form>
		</div>
		<div class="main-content__right-column">
			<h3 class="main-content__noticias">Últimas noticias</h3>
			<div class="carousel-container">
				<div class="carousel">
					<img src="">
					<h4></h4>
				</div>
			</div>
		</div>
	</section>
	<footer class="footer">
		<div class="footer__enlaces">
			<a href="${pageContext.request.contextPath}/footer/Terminos.jsp">Términos
				legales</a> <a
				href="${pageContext.request.contextPath}/footer/Privacidad.jsp">Política
				de privacidad</a> <a
				href="${pageContext.request.contextPath}/footer/Cookies.jsp">Cookies</a>
			<a
				href="${pageContext.request.contextPath}/footer/Accesibilidad.jsp">Accesibilidad</a>
		</div>
		<div class="footer__redes-sociales">
			<a href="#"><i class="fab fa-facebook"></i></a> <a href="#"><i
				class="fab fa-youtube"></i></a> <a href="#"><i
				class="fab fa-linkedin"></i></a> <a href="#"><i
				class="fab fa-instagram"></i></a>
		</div>
	</footer>
</body>
</html>