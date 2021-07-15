package com.entities;

import java.util.ArrayList;

public class User {

	private String nom;
	private String email;
	private int age;
	private ArrayList<Tache> taches;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String nom, String email, int age, ArrayList<Tache> taches) {
		super();
		this.nom = nom;
		this.email = email;
		this.age = age;
		this.taches = taches;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<Tache> getTaches() {
		return taches;
	}

	public void setTaches(ArrayList<Tache> taches) {
		this.taches = taches;
	}
}
