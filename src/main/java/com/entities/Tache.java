package com.entities;

public class Tache {

	private long id;
	private String description;

	public Tache() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tache(long id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
