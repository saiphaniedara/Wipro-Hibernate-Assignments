package com.wipro.service;

import java.util.Scanner;

import com.wipro.DAO.FlowerDAO;
import com.wipro.bean.Flower;

public class TestFlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowerDAO fd = new FlowerDAO();
		System.out.println("Enter ID of the Flower : ");
		String fId = new Scanner(System.in).next();
		String msg = fd.deleteFlower(fId);
		System.out.println(msg);
	}

}
