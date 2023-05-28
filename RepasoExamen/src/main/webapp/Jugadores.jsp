<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jugadores</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/Controlador"
		method="post">
		<fieldset>
			<legend align="left">Seleccion de Jugadores</legend>
				<table border=1>
					<tr>
						<th>PLAYERID</th>
						<th>FIRSTNAME</th>
						<th>LASTNAME</th>
					</tr>
				<c:forEach items="${listadojugadores}" var="Jugadores">

						<tr>
							<td>${Jugadores.playerId}</td>
							<td>${Jugadores.lastName}</td>
							<td>${Jugadores.firstName}</td>
						</tr>
						</c:forEach>
				</table>

		</fieldset>
	</form>
</body>
</html>