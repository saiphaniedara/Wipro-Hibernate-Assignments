package com.wipro.service;

import com.wipro.DAO.CarOwnerDAO;
import com.wipro.bean.CarDetails;
import com.wipro.bean.CarOwner;

public class Assignment1 {
	
	public static void main(String[] args) {
		CarOwnerDAO dao = new CarOwnerDAO();
		CarDetails cd = new CarDetails(1,"KL-07", "AB 123 Polo", "White", "Volkswagen");
		CarOwner co = new CarOwner(102,"Sai Phani",cd);
		System.out.println(dao.insertCarOwnerDetails(co));
	}
}
