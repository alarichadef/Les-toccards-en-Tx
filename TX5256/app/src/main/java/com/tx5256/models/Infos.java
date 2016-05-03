package com.tx5256.models;

public class Infos {
	int ID;
	boolean visibility;
	Patient patient;
	
	public Infos(int iD, boolean visibility, Patient patient) {
		super();
		this.ID = iD;
		this.visibility = visibility;
		this.patient=patient;
	}
	
	public Patient getPatient() {
		return patient;
	}

	public int getID() {
		return ID;
	}
	
	public boolean isVisibility() {
		return visibility;
	}
	
	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}
	
}
