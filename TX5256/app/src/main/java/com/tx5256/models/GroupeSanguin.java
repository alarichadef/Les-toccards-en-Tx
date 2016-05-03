package com.tx5256.models;

public class GroupeSanguin {
	Abo abo;
	Rhesus rhesus;
	Patient patient;
	
	public GroupeSanguin(Abo abo, Rhesus rhesus, Patient patient) {
		super();
		this.abo = abo;
		this.rhesus = rhesus;
		this.patient = patient;
	}
	
	public Abo getAbo() {
		return abo;
	}
	
	public void setAbo(Abo abo) {
		this.abo = abo;
	}
	
	public Rhesus getRhesus() {
		return rhesus;
	}
	
	public void setRhesus(Rhesus rhesus) {
		this.rhesus = rhesus;
	}
	
	public Patient getPatient() {
		return patient;
	}
	
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	public enum Abo{
		A,
		B,
		O,
		AB;
	}
	
	public enum Rhesus{
		Plus,
		Moins;
	}
}