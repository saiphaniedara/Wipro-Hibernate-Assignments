package com.wipro.service;

import com.wipro.bean.Address;
import com.wipro.bean.Employee;
import com.wipro.dao.EmployeeDAO;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad = new Address("1-23","colony","Sangareddy");
		Employee emp = new Employee(101,"Sai Phani",20,ad);
		EmployeeDAO dao = new EmployeeDAO();
		System.out.println(dao.insertEmployee(emp));
	}

}
