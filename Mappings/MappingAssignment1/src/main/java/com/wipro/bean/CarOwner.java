package com.wipro.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CarOwner {
	@Id
	private int ownerId;
	private String ownerName;
	@OneToOne
	private CarDetails car;
	public CarOwner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarOwner(int ownerId, String ownerName, CarDetails car) {
		super();
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.car = car;
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
	public CarDetails getCar() {
		return car;
	}
	public void setCar(CarDetails car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "CarOwner [ownerId=" + ownerId + ", ownerName=" + ownerName + ", car=" + car + "]";
	}	
}
