package com.tx5256.models;

public class CommentaireNote {
	int id_commentaire;
	String contenu;
	boolean visibilite;
	Note note;
	
	/**
	 * @param id_commentaire
	 * @param contenu
	 * @param visibilite
	 * @param note
	 */
	public CommentaireNote(int id_commentaire, String contenu, boolean visibilite, Note note) {
		super();
		this.id_commentaire = id_commentaire;
		this.contenu = contenu;
		this.visibilite = visibilite;
		this.note = note;
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
	public Note getNote() {
		return note;
	}
	public void setNote(Note note) {
		this.note = note;
	}
}
