package com.tx5256.models;

public class CorpsMedical extends User{
	int id;
	Type type;
	int id_user;
	
	public CorpsMedical(int iD, String nom, String prenom, String adresse, String tel, int id, Type type, int id_user) {
		super(iD, nom, prenom, adresse, tel);
		this.id = id;
		this.type = type;
		this.id_user = id_user;
	}

	public int getId() {
		return id;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public int getId_user() {
		return id_user;
	}

	public enum Type{
		medecin,
		infirmier,
		aide_soignant;
	}
}
