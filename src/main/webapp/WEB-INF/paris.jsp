<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Paris sportif</title>
<style>
	<%@ include file = "style.css" %>
</style>
</head>
<body>

	<div ${ majeur ? ""  : "style='display:none'"}>
		<h1>Contenu du site</h1>
		<p>lorem klj bh hvh bjkv hvj blj</p>
	</div>
	
	<h1 ${ !majeur ? ""  : "style='display:none'"}
	 class="rouge">Vous etes mineur ! accès réfusé</h1>


</body>
</html>