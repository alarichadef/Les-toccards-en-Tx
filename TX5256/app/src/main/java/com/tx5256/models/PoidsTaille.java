package com.tx5256.models;

import java.util.Date;

public class PoidsTaille extends Infos{
	Date datedeprise;
	double poids;
	double taille;

	public PoidsTaille(Date datedeprise, double poids, double taille, int iD, boolean visibility, Patient patient) {
		super(iD, visibility, patient);
		if(datedeprise.after(new Date()) || poids<=0)
			throw new Error("incorrect fields");
		this.datedeprise=datedeprise;
		this.poids=poids;
		this.taille=taille;
		this.patient.setPoids(poids);
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}

	public Date getDatedeprise() {
		return datedeprise;
	}

	
}
