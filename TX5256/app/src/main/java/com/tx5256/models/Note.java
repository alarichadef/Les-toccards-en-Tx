package com.tx5256.models;

import java.util.Date;

public class Note {
	int id_note;
    Date date_note;
    String contenu;
    boolean visibilite;
    Patient patient;
    CorpsMedical corpsMedical;
    
	/**
	 * @param id_note
	 * @param date_note
	 * @param contenu
	 * @param visibilite
	 * @param patient
	 * @param corpsMedical
	 */
	public Note(int id_note, Date date_note, String contenu, boolean visibilite, Patient patient,
			CorpsMedical corpsMedical) {
		super();
		this.id_note = id_note;
		this.date_note = date_note;
		this.contenu = contenu;
		this.visibilite = visibilite;
		this.patient = patient;
		this.corpsMedical = corpsMedical;
	}
	
	public int getId_note() {
		return id_note;
	}
	public void setId_note(int id_note) {
		this.id_note = id_note;
	}
	public Date getDate_note() {
		return date_note;
	}
	public void setDate_note(Date date_note) {
		this.date_note = date_note;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public boolean isVisibilite() {
		return visibilite;
	}
	public void setVisibilite(boolean visibilite) {
		this.visibilite = visibilite;
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
