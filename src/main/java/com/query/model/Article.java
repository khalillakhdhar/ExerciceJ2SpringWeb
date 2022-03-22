package com.query.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Article {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String date;
private String auteur;
private boolean publication;
private String resume;
private String type;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getAuteur() {
	return auteur;
}
public void setAuteur(String auteur) {
	this.auteur = auteur;
}
public boolean isPublication() {
	return publication;
}
public void setPublication(boolean publication) {
	this.publication = publication;
}
public String getResume() {
	return resume;
}
public void setResume(String resume) {
	this.resume = resume;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Article() {
	// TODO Auto-generated constructor stub
}
public Article(String date, String auteur, boolean publication, String resume, String type) {
	super();
	this.date = date;
	this.auteur = auteur;
	this.publication = publication;
	this.resume = resume;
	this.type = type;
}
@Override
public String toString() {
	return "Article [id=" + id + ", date=" + date + ", auteur=" + auteur + ", publication=" + publication + ", resume="
			+ resume + ", type=" + type + "]";
}





}
