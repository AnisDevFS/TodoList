<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Erreur de connexion</title>
</head>
<body style="color: red">

	<h1 >Erreur de Création de Profil</h1>
	
	<%
		ArrayList<String> erreurs = (ArrayList<String>) request.getAttribute("erreurs");
		for (String err : erreurs) {
			out.print("- " + err + "<br>");
		}
	%>

</body>
</html>