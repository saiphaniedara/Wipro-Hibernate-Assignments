package com.wipro.bean;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String hNo;
	private String streetName;
	private String city;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String hNo, String streetName, String city) {
		super();
		this.hNo = hNo;
		this.streetName = streetName;
		this.city = city;
	}
	public String gethNo() {
		return hNo;
	}
	public void sethNo(String hNo) {
		this.hNo = hNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", streetName=" + streetName + ", city=" + city + "]";
	}	
}
