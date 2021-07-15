<%@page import="com.entities.Tache"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.entities.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>INFO de ${ myUser.nom }</title>
</head>
<body>

	<h1>Bienvenue</h1>
	
	<h2>Nom : ${ myUser.nom }</h2>
	<h2>Email : ${ myUser.email }</h2>
	<h2>Age : ${ myUser.age }</h2>
	
	<h2>Sa liste de taches</h2>
	<%
		User user = (User) request.getAttribute("myUser");
		ArrayList<Tache> taches = user.getTaches();
		for (Tache tache : taches) {
			out.print(" - " + tache.getDescription() + "<br>");
		}
	%>

</body>
</html>