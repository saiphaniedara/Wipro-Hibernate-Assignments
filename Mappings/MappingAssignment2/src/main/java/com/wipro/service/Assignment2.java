package com.wipro.service;

import java.util.ArrayList;
import java.util.List;

import com.wipro.DAO.CarOwnerDAO;
import com.wipro.bean.CarDetails;
import com.wipro.bean.MultiCarOwner;

public class Assignment2 {
	
	public static void main(String[] args) {
		CarOwnerDAO dao = new CarOwnerDAO();
		List<CarDetails> cars = new ArrayList<CarDetails>();
		CarDetails cd1 = new CarDetails(1,"KL-07", "AB 123 Polo", "White", "Volkswagen");
		cars.add(cd1);
		CarDetails cd2 = new CarDetails(2,"KL-07", "AB 234 Vento", "Black", "Volkswagen");
		cars.add(cd2);
		MultiCarOwner co = new MultiCarOwner(103,"Sai Krishna",cars);
		System.out.println(dao.insertCarOwnerDetails(co));
	}
}
