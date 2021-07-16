package com.servlets;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Profil
 */
@WebServlet("/profil3")
public class ProfilEx3 extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public ProfilEx3() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/profil3/formulaire.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String nom = request.getParameter("nom");
		String age = request.getParameter("age");
		String adresse = request.getParameter("adresse");
		
		String emailErreur = "";
		String passwordErreur = "";
		String nomErreur = "";
		String ageErreur = "";
		String adresseErreur = "";
		boolean erreurExiste = false;

		if (email.isEmpty()) emailErreur = "Email pas renseign�";
		else {
			if (!goodmail(email)) emailErreur = "Email mal �crit sinon le mail doit etre gmail ou yahoo";
		}
		
		if (password.length() == 0) passwordErreur = "Password pas renseign�";
		
		if (nom.isEmpty()) nomErreur = "Nom pas renseign�";
		else {
			if (Character.isLowerCase(nom.charAt(0))) nomErreur = "Le nom doit commencer par une Maj";
		}
		
		if (adresse.equals("")) adresseErreur = "Adresse pas renseign�e";
		
		if (age.isEmpty()) ageErreur= "Age pas renseign�";
		else {
			if (Integer.parseInt(age) < 0) ageErreur = "Age n�gatif";
			else if (Integer.parseInt(age) > 120) ageErreur = "Age trop elev�";
		}
		
		String messageErreurCombines = passwordErreur +emailErreur + ageErreur + adresseErreur + nomErreur;
		request.setAttribute("age", age);
		request.setAttribute("email", email);
		request.setAttribute("adresse", adresse);
		request.setAttribute("nom", nom);
		
		if (messageErreurCombines.isEmpty()) {
			request.getRequestDispatcher("/WEB-INF/profil3/reussite.jsp").forward(request, response);
		}
		else {
			request.setAttribute("password", password);
			request.setAttribute("passwordErreur", passwordErreur);
			request.setAttribute("ageErreur", ageErreur);
			request.setAttribute("emailErreur", emailErreur);
			request.setAttribute("adresseErreur", adresseErreur);
			request.setAttribute("nomErreur", nomErreur);
			request.getRequestDispatcher("/WEB-INF/profil3/formulaire.jsp").forward(request, response);
		}

	}
	
	boolean goodmail(String mail) {
		String[] tab = mail.split("@");
		if (tab.length == 2 && 
				(tab[1].equals("yahoo.fr") || tab[1].equals("gmail.com"))) {
			return true;
		}
		return false;
	}

}
