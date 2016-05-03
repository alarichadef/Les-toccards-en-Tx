package com.tx5256.models;

public class Allergie {
	int id_allergie;
	String nom;
	
	/**
	 * @param id_allergie
	 * @param nom
	 */
	public Allergie(int id_allergie, String nom) {
		super();
		this.id_allergie = id_allergie;
		this.nom = nom;
	}
	
	public int getId_allergie() {
		return id_allergie;
	}
	public void setId_allergie(int id_allergie) {
		this.id_allergie = id_allergie;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
