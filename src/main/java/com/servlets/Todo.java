package com.servlets;

import java.io.IOException;
import java.util.ArrayList;

import com.entities.Dossier;
import com.entities.Tache;
import com.entities.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Todo
 */
@WebServlet("/todo")
public class Todo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Todo() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
//    Créer une page qui doit afficher les informations d'un user le nom 
//    d’user doit être récupéré d’un paramètre de l’url
//    Les tâches d'un user doivent être afficher dont la même page
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nom = request.getParameter("name");
		Tache t1 = new Tache(1, "acheter lait");
		Tache t2 = new Tache(2, "acheter du pain");
		ArrayList<Tache> listeTaches = new ArrayList<Tache>();
		listeTaches.add(t1) ; listeTaches.add(t2);
		
		Tache t11 = new Tache(1, "Créer la DB");
		Tache t22 = new Tache(2, "Faire la conception");
		ArrayList<Tache> listeTaches2 = new ArrayList<Tache>();
		listeTaches2.add(t11) ; listeTaches2.add(t22);
		ArrayList<Dossier> dossiers = new ArrayList<Dossier>();
		Dossier courses = new Dossier(1, "faireles courses", listeTaches);
		Dossier projet = new Dossier(1, "Projet Spring", listeTaches2);
		
		dossiers.add(projet); dossiers.add(courses);
		User user = new User(nom, "alex@pop.fr", 15, dossiers);

		request.setAttribute("myUser", user);
		request.getRequestDispatcher("/WEB-INF/todo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
