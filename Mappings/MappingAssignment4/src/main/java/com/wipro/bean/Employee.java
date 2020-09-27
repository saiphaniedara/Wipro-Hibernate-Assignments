package com.wipro.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Table")
public class Employee {
	@javax.persistence.Id
	private int id;
	private String name;
	private int age;
	@OneToOne(cascade = CascadeType.ALL)
	private Passport passport;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, int age, Passport passport) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.passport = passport;
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
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
