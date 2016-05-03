package com.tx5256.models;

public class MaladiePatient extends Infos{
	Maladie[] maladies;
	
	public MaladiePatient(Maladie[] maladies, int iD, boolean visibility, Patient patient) {
		super(iD, visibility, patient);
	}

	public Maladie[] getMaladies() {
		return maladies;
	}

	public void setMaladies(Maladie[] maladies) {
		this.maladies = maladies;
	}

}
