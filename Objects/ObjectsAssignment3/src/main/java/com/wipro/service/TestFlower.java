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
		System.out.println("Enter Price : ");
		int price = new Scanner(System.in).nextInt();
		String msg = fd.UpdateFlower(fId, price);
		System.out.println(msg);
	}

}
