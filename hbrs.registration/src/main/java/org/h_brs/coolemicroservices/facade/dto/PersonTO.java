package org.h_brs.coolemicroservices.facade.dto;

public class PersonTO {
	private String anrede;
	private String vorname;
	private String nachname;
	private String email;
	private String username;
	private String password;
	private String land;
	private String plz;
	private String ort;
	private String strasse;
	private String hausnummer;
	
	
	public String getAnrede() {
		return anrede;
	}
	public void setAnrede(String anrede) {
		this.anrede = anrede;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		this.land = land;
	}
	public String getPlz() {
		return plz;
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public String getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}
}