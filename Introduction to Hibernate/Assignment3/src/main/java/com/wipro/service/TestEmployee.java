package com.wipro.service;

import com.wipro.DAO.EmployeeDAO;
import com.wipro.bean.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDAO ed = new EmployeeDAO();
		Employee e1 = new Employee("Sai Phani",	"Intern", 10000);
		System.out.println(ed.insertEmployee(e1));
		Employee e2 = new Employee("Sai Krishna", "Engineer", 15000);
		System.out.println(ed.insertEmployee(e2));
		Employee e3 = new Employee("Surya",	"Developer", 20000);
		System.out.println(ed.insertEmployee(e3));
		Employee e4 = new Employee("Pavan",	"Intern", 12000);
		System.out.println(ed.insertEmployee(e4));
		Employee e5 = new Employee("Vamsi",	"HR", 8000);
		System.out.println(ed.insertEmployee(e5));			
	}

}
