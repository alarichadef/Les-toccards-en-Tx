package com.tx5256.models;

public class CommentaireVocal {
	int id_commentaire;
	String contenu;
	boolean visibilite;
	EnregistrementVocal enregistrementVocal;
	
	/**
	 * @param id_commentaire
	 * @param contenu
	 * @param visibilite
	 * @param enregistrementVocal
	 */
	public CommentaireVocal(int id_commentaire, String contenu, boolean visibilite,
			EnregistrementVocal enregistrementVocal) {
		super();
		this.id_commentaire = id_commentaire;
		this.contenu = contenu;
		this.visibilite = visibilite;
		this.enregistrementVocal = enregistrementVocal;
	}
	
	public int getId_commentaire() {
		return id_commentaire;
	}
	public void setId_commentaire(int id_commentaire) {
		this.id_commentaire = id_commentaire;
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
	public EnregistrementVocal getEnregistrementVocal() {
		return enregistrementVocal;
	}
	public void setEnregistrementVocal(EnregistrementVocal enregistrementVocal) {
		this.enregistrementVocal = enregistrementVocal;
	}
	
}
