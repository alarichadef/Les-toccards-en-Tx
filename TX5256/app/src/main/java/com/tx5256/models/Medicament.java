package com.tx5256.models;

public class Medicament {
	int id_medicament;
	String nom_simple;
	String nom_scientifique;
	
	public Medicament(int id_medicament, String nom_simple, String nom_scientifique) {
		super();
		this.id_medicament = id_medicament;
		this.nom_simple = nom_simple;
		this.nom_scientifique = nom_scientifique;
	}
	
	public int getId_medicament() {
		return id_medicament;
	}
	public void setId_medicament(int id_medicament) {
		this.id_medicament = id_medicament;
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
