package com.wipro.service;

import com.wipro.DAO.FlowerDAO;
import com.wipro.bean.Flower;

public class TestFlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowerDAO fd = new FlowerDAO();
		Flower rose = new Flower("RS11", "Rose", "Red", 15);
		String msg = fd.insertFlower(rose);
		System.out.println(msg);		
	}

}
