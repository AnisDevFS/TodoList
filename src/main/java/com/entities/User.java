package com.entities;

import java.util.ArrayList;

public class User {

	private String nom;
	private String email;
	private int age;
	private ArrayList<Dossier> dossiers;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String nom, String email, int age, ArrayList<Dossier> dossiers) {
		super();
		this.nom = nom;
		this.email = email;
		this.age = age;
		this.dossiers = dossiers;
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

	public ArrayList<Dossier> getDossiers() {
		return dossiers;
	}

	public void setDossiers(ArrayList<Dossier> dossiers) {
		this.dossiers = dossiers;
	}

}
