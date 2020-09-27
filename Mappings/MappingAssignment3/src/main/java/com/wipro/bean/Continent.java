package com.wipro.bean;

import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Continent {
	@Id
	private String cname;
	@ElementCollection
	private Map<String,String> countries;
	public Continent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Continent(String cname, Map<String, String> countries) {
		super();
		this.cname = cname;
		this.countries = countries;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Map<String, String> getCountries() {
		return countries;
	}
	public void setCountries(Map<String, String> countries) {
		this.countries = countries;
	}
	@Override
	public String toString() {
		return "Continent [cname=" + cname + ", countries=" + countries + "]";
	}
}
