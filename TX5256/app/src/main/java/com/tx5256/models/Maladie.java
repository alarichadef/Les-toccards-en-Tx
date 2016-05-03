package com.tx5256.models;

public class Maladie {
	int id;
	String nom_simple;
	String nom_scientifique;
	
	public Maladie(int id, String nom_simple, String nom_scientifique) {
		super();
		this.id = id;
		this.nom_simple = nom_simple;
		this.nom_scientifique = nom_scientifique;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom_simple() {
		return nom_simple;
	}
	public void setNom_simple(String nom_simple) {
		this.nom_simple = nom_simple;
	}
	public String getNom_scientifique() {
		return nom_scientifique;
	}
	public void setNom_scientifique(String nom_scientifique) {
		this.nom_scientifique = nom_scientifique;
	}
	
	
}
