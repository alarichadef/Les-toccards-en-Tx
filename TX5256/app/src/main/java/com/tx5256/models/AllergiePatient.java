package com.tx5256.models;

public class AllergiePatient extends Infos{
	Allergie[] allergies;
	
	/**
	 * @param iD
	 * @param visibility
	 * @param patient
	 * @param allergies
	 */
	public AllergiePatient(int iD, boolean visibility, Patient patient, Allergie[] allergies) {
		super(iD, visibility, patient);
		this.allergies = allergies;
	}

	public Allergie[] getAllergies() {
		return allergies;
	}

	public void setAllergies(Allergie[] allergies) {
		this.allergies = allergies;
	}
	
	
}
