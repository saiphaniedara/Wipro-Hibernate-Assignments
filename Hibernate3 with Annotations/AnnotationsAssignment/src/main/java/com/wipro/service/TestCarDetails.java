package com.wipro.service;

import com.wipro.DAO.CarDetailsDAO;
import com.wipro.bean.CarDetails;

public class TestCarDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarDetailsDAO cdao = new CarDetailsDAO();
		CarDetails cd1 = new CarDetails(1,"KL-07", "AB 123 Polo", "White", "Volkswagen");
		System.out.println(cdao.insertDetails(cd1));
		CarDetails cd2 = new CarDetails(2,"KL-07","AB 234 Vento","Black","Volkswagen");
		System.out.println(cdao.insertDetails(cd2));
		CarDetails cd3 = new CarDetails(3,"KL-07", "AC 345 Corolla", "Silver", "Toyota");
		System.out.println(cdao.insertDetails(cd3));
	}

}
