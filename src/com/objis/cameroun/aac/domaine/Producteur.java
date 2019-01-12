package com.objis.cameroun.aac.domaine;

public class Producteur {
	
	private String nom ;
	private String prenom ;
	private String speculation ;
	private int rendement ;
	
	
	public Producteur() {
		super();
	}


	public Producteur(String nom, String prenom, String speculation, int rendement) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.speculation = speculation;
		this.rendement = rendement;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getSpeculation() {
		return speculation;
	}


	public void setSpeculation(String speculation) {
		this.speculation = speculation;
	}


	public int getRendement() {
		return rendement;
	}


	public void setRendement(int rendement) {
		this.rendement = rendement;
	}


	@Override
	public String toString() {
		return "Producteur [nom=" + nom + ", prenom=" + prenom + ", speculation=" + speculation + ", rendement="
				+ rendement + "]";
	}
	
	
	
	

}
