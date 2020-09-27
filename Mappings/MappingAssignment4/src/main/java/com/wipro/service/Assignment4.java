package com.wipro.service;

import com.wipro.bean.Employee;
import com.wipro.bean.Passport;
import com.wipro.dao.EmployeeDAO;

public class Assignment4 {
	public static void main(String[] args) {
		Passport passport = new Passport(1, "ZXCVB234", "India");
		Employee employee = new Employee(101,"Sai Phani",20,passport);
		EmployeeDAO dao = new EmployeeDAO();
		System.out.println(dao.insertEmployee(employee));
	}
}
