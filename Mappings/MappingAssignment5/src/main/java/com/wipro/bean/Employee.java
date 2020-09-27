package com.wipro.bean;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Emp_Table")
public class Employee {
	@Id
	private int id;
	private String name;
	private int age;
	@Embedded
	private Address address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, int age, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
