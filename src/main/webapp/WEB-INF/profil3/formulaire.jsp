<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">

		<br>
		<h1>Création de Profil</h1>
		<br>
		<form method="post" action="profil3">
			<div class="form-group">
				<label for="email">Email</label> <input type="email"
					class="form-control" id="email" name="email" value="${ email }"
					placeholder="Enter email">
			<small class="text-danger"> ${ emailErreur } </small>
					
			</div>
			<div class="form-group">
				<label for="password">Password</label> <input type="password"
					class="form-control" id="password" name="password" value="${ password }"
					placeholder="Password">
			<small class="text-danger"> ${ passwordErreur } </small>
					
			</div>
			<div class="form-group">
				<label for="nom">Nom</label> <input type="text" class="form-control"
					id="nom" name="nom" placeholder="Nom" value="${ nom }">
			<small class="text-danger"> ${ nomErreur } </small>
			
			</div>
			<div class="form-group">
				<label for="age">Age</label> <input type="text" class="form-control"
					id="age" name="age" placeholder="age" value="${ age }">
			<small class="text-danger"> ${ ageErreur } </small>
					
			</div>
			<div class="form-group">
				<label for="adresse">Adresse</label> <input type="text"
					class="form-control" id="adresse" name="adresse"
					placeholder="adresse" value="${ adresse }">
			<small class="text-danger"> ${ adresseErreur } </small>
			</div>
			
			
			<br>
			<button type="submit" class="btn btn-primary">Créer Profil</button>
		</form>
	</div>