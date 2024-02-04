package com.example.examin3;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Etudiant {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Etudiant(String nom, String adresse, String mail, Date date) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.mail = mail;
		this.date = date;
	}
	public Etudiant() {
	}
	@Id
	@GeneratedValue
	private int id;
	private String nom;
	private String adresse;
	private String mail;
	private Date date;
	
	
}
