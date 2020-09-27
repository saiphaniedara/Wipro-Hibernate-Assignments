package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Car_Details")
public class CarDetails {
	@Id
	private int carId;
	@Column(name="RegNo",length=5)
	private String regNo;
	@Column(name="Model",length=20)
	private String model;
	@Column(name="Color",length=10)
	private String color;
	@Column(name="Manufacturer",length=20)
	private String manufacturer;
	public CarDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarDetails(int carId, String regNo, String model, String color, String manufacturer) {
		super();
		this.carId = carId;
		this.regNo = regNo;
		this.model = model;
		this.color = color;
		this.manufacturer = manufacturer;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	@Override
	public String toString() {
		return "CarDetails [carId=" + carId + ", regNo=" + regNo + ", model=" + model + ", color=" + color
				+ ", manufacturer=" + manufacturer + "]";
	}
}
