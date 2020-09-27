package com.wipro.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class MultiCarOwner {
	@Id
	private int ownerId;
	private String ownerName;
	@OneToMany(cascade = CascadeType.ALL)
	private List<CarDetails> cars;
	public MultiCarOwner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MultiCarOwner(int ownerId, String ownerName, List<CarDetails> cars) {
		super();
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.cars = cars;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public List<CarDetails> getCars() {
		return cars;
	}
	public void setCars(List<CarDetails> cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "MultiCarOwner [ownerId=" + ownerId + ", ownerName=" + ownerName + ", cars=" + cars + "]";
	}
}
