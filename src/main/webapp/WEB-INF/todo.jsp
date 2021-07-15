<%@page import="com.entities.Dossier"%>
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
<style>
	<%@ include file = "style.css" %>
</style>
</head>
<body>

	<h1>Bienvenue</h1>
	
	<h2 class="${ myUser.age >= 18 ? "vert" : "rouge" }"> Nom : ${ myUser.nom }
	<strong>${ myUser.age >= 18 ? "(Majeur)" : "(Mineur)" } </strong> </h2>
	<h2>Email : ${ myUser.email }</h2>
	<h2>Age : ${ myUser.age }</h2>
	
	<h2>Sa liste de Dossiers :</h2>
	<%
		User user = (User) request.getAttribute("myUser");
		ArrayList<Dossier> dossiers = user.getDossiers();
		
		for (Dossier d : dossiers) {
			out.print("<h2>" + d.getNom() + "<br></h2>" );
			for (Tache tache : d.getTaches()) {
				
				out.print(" - " + tache.getDescription() + "<br>");
			}
			out.print("<br>");
		}
	%>

</body>
</html>