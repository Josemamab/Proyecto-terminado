<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ page
	language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Clubes</title>
</head>
<body style="test-align: center;">
	<h1>Clubes</h1>
	<form action="${pageContext.request.contextPath}/Controlador"
		method="post">
		<fieldset>
			<legend align="left">Seleccion de Clubes</legend>

				<table border=1>
					<tr>
						<th>TEAMID</th>
						<th>TEAMNAME</th>
						<th>CITY</th>
						<th>CAPACITY</th>
						<th>STADIUMNAME</th>
						<th>Plantillas</th>
					</tr>
					<c:forEach items="${listadoclubes}" var="Liga">
						<tr>
							<td>${Liga.teamId}</td>
							<td>${Liga.teamName}</td>
							<td>${Liga.city}</td>
							<td>${Liga.capacity}</td>
							<td>${Liga.stadiumName}</td>
							<td><a href="${pageContext.request.contextPath}/Controlador?operacion=Jugadores&idequipo=${Liga.teamId}">Plantilla</a></td>
						</tr>
					</c:forEach>
				</table>
		</fieldset>




	</form>
</body>
</html>