package com.tx5256.models;

public class VaccinPatient extends Infos{
	int id_vaccin;
    String nom;
    int duree_entre_deux_prises; //0 si injection unique
    
	/**
	 * @param iD
	 * @param visibility
	 * @param patient
	 * @param id_vaccin
	 * @param nom
	 * @param duree_entre_deux_prises
	 */
	public VaccinPatient(int iD, boolean visibility, Patient patient, int id_vaccin, String nom,
			int duree_entre_deux_prises) {
		super(iD, visibility, patient);
		this.id_vaccin = id_vaccin;
		this.nom = nom;
		this.duree_entre_deux_prises = duree_entre_deux_prises;
	}
	public int getId_vaccin() {
		return id_vaccin;
	}
	public void setId_vaccin(int id_vaccin) {
		this.id_vaccin = id_vaccin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getDuree_entre_deux_prises() {
		return duree_entre_deux_prises;
	}
	public void setDuree_entre_deux_prises(int duree_entre_deux_prises) {
		this.duree_entre_deux_prises = duree_entre_deux_prises;
	}
    
    
}
