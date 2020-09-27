package com.wipro.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passport {
	@Id
	private int id;
	private String passportNumber;
	private String countryName;
	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passport(int id, String passportNumber, String countryName) {
		super();
		this.id = id;
		this.passportNumber = passportNumber;
		this.countryName = countryName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		return "Passport [id=" + id + ", passportNumber=" + passportNumber + ", countryName=" + countryName + "]";
	}
}
