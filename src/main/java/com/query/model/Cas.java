package com.query.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cas implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String nomComplet;
private String telephone;
private String adresse;
private int etat;
private int codePostale;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNomComplet() {
	return nomComplet;
}
public void setNomComplet(String nomComplet) {
	this.nomComplet = nomComplet;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public int getEtat() {
	return etat;
}
public void setEtat(int etat) {
	this.etat = etat;
}
public int getCodePostale() {
	return codePostale;
}
public void setCodePostale(int codePostale) {
	this.codePostale = codePostale;
}
@Override
public String toString() {
	return "Cas [id=" + id + ", nomComplet=" + nomComplet + ", telephone=" + telephone + ", adresse=" + adresse
			+ ", etat=" + etat + ", codePostale=" + codePostale + "]";
}
public Cas(String nomComplet, String telephone, String adresse, int etat, int codePostale) {
	super();
	this.nomComplet = nomComplet;
	this.telephone = telephone;
	this.adresse = adresse;
	this.etat = etat;
	this.codePostale = codePostale;
}
public Cas() {
	super();
}




}
