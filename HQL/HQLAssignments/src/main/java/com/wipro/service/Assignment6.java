package com.wipro.service;

import java.util.Scanner;

import com.wipro.DAO.CarDetailsDAO;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Reg No : ");
		String regNo = new Scanner(System.in).next();
		CarDetailsDAO cd = new CarDetailsDAO();
		cd.displayCountOfCarsByRegNo(regNo);
	}

}
