package com.entities;

import java.util.ArrayList;

public class Dossier {

	private long id;
	private String nom;
	private ArrayList<Tache> taches;

	public Dossier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dossier(long id, String nom, ArrayList<Tache> taches) {
		super();
		this.id = id;
		this.nom = nom;
		this.taches = taches;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Tache> getTaches() {
		return taches;
	}

	public void setTaches(ArrayList<Tache> taches) {
		this.taches = taches;
	}

}
