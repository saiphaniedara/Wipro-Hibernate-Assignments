package com.wipro.service;

import java.util.Date;

import com.wipro.DAO.EmpDAO;
import com.wipro.bean.Emp;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDAO ed = new EmpDAO();
		Date d = new Date();
		Emp employee = new Emp(2020,"Sai Phani","Engineer",15,d,15000,100,20);
		String msg = ed.insertEmployee(employee);
		System.out.println(msg);
	}

}
