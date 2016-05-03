package com.tx5256.models;

import java.util.Date;

public class Patient extends User{
	int secu;
	Sexe sexe;
	Date date_naissance;
	Double poids;
	
	public Patient(int iD, String nom, String prenom, String adresse, String tel, int secu, Sexe sexe, Date date_naissance, Double poids, int id) {
		super(iD, nom, prenom, adresse, tel);
		if((Math.log10(secu)+1)!=15 || date_naissance.after(new Date()) || poids<=0)
			throw new Error("incorrect fields");
		this.secu = secu;
		this.sexe = sexe;
		this.date_naissance = date_naissance;
		this.poids = poids;
	}

	public int getSecu() {
		return secu;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public Date getDate_naissance() {
		return date_naissance;
	}

	public Double getPoids() {
		return poids;
	}

	public void setPoids(Double poids) {
		this.poids = poids;
	}

	public enum Sexe{
		F,
		M;
	}
}
