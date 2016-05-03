package com.tx5256.models;

abstract class User {
	int ID;
	String nom;
	String prenom;
	String adresse;
	String tel;
	
	public User(int iD, String nom, String prenom, String adresse, String tel) {
		super();
		if (nom.length()>50 || prenom.length()>50 || adresse.length()>100 || tel.length()!=10)
			throw new Error("Incorrect fields sizes");
		ID = iD;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.tel = tel;
	}
	
	public int getID() {
		return ID;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		if(nom.length()>50)
			throw new Error("name length must be lower than 50");
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		if(prenom.length()>50)
			throw new Error("firstname length must be lower than 50");
		this.prenom=prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		if(adresse.length()>100)
			throw new Error("adresse length must be lower than 100");
		this.adresse = adresse;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		if(nom.length()!=10)
			throw new Error("phone number size have to be equal to 10");
		this.tel = tel;
	}
	
	
}
