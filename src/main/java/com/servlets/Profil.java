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
@WebServlet("/profil")
public class Profil extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public Profil() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/profil/formulaire.jsp").forward(request, response);
		
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

		ArrayList<String> erreurs = new ArrayList<String>();
		if (email.isEmpty()) erreurs.add("Email pas renseign�");
		if (password.length() == 0) erreurs.add("Password pas renseign�");
		if (nom.isEmpty()) erreurs.add("Nom pas renseign�");
		if (adresse.equals("")) erreurs.add("Adresse pas renseign�e");
		if (age.isEmpty()) erreurs.add("Age pas renseign�");
		else {
			if (Integer.parseInt(age) < 0) erreurs.add("Age n�gatif");
		}
		
		if (erreurs.size() > 0) {
			request.setAttribute("erreurs", erreurs);
			request.getRequestDispatcher("/WEB-INF/profil/erreur.jsp").forward(request, response);
		}
		else {
			request.setAttribute("age", age);
			request.setAttribute("email", email);
			request.setAttribute("adresse", adresse);
			request.setAttribute("nom", nom);
			request.getRequestDispatcher("/WEB-INF/profil/reussite.jsp").forward(request, response);
		}


	}

}
