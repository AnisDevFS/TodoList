package com.servlets;

import java.io.IOException;
import java.util.ArrayList;

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
		User user = new User(nom, "alex@pop.fr", 25, listeTaches);

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
