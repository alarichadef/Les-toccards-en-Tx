package com.tx5256.models;

public class Traitement extends Infos {
	Medicament[] medicaments;
	int duree;
	
	public Traitement(int iD, boolean visibility, Patient patient, Medicament[] medicaments, int duree) {
		super(iD, visibility, patient);
		this.medicaments = medicaments;
		this.duree = duree;
	}
	public Medicament[] getMedicaments() {
		return medicaments;
	}
	public void setMedicaments(Medicament[] medicaments) {
		this.medicaments = medicaments;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	
	
}
