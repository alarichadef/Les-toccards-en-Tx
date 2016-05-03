package com.tx5256.models;

import java.util.Date;

public class EnregistrementVocal {
	int id_enregistrement;
    Date date_prise;
    String contenu;
    Patient patient;
    CorpsMedical corpsMedical;
    
	/**
	 * @param id_enregistrement
	 * @param date_prise
	 * @param contenu
	 * @param patient
	 * @param corpsMedical
	 */
	public EnregistrementVocal(int id_enregistrement, Date date_prise, String contenu, Patient patient,
			CorpsMedical corpsMedical) {
		super();
		this.id_enregistrement = id_enregistrement;
		this.date_prise = date_prise;
		this.contenu = contenu;
		this.patient = patient;
		this.corpsMedical = corpsMedical;
	}
	
	public int getId_enregistrement() {
		return id_enregistrement;
	}
	public void setId_enregistrement(int id_enregistrement) {
		this.id_enregistrement = id_enregistrement;
	}
	public Date getDate_prise() {
		return date_prise;
	}
	public void setDate_prise(Date date_prise) {
		this.date_prise = date_prise;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public CorpsMedical getCorpsMedical() {
		return corpsMedical;
	}
	public void setCorpsMedical(CorpsMedical corpsMedical) {
		this.corpsMedical = corpsMedical;
	}
    
}
