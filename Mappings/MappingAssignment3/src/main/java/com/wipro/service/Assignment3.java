package com.wipro.service;

import java.util.TreeMap;

import com.wipro.bean.Continent;
import com.wipro.dao.ContinentDAO;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> countries1 = new TreeMap<String,String>();
		countries1.put("India", "New Delhi");
		countries1.put("Japan", "Tokyo");
		countries1.put("Afghanistan", "Kabul");
		Continent cont1 = new Continent("Asia", countries1);
		ContinentDAO dao = new ContinentDAO();
		System.out.println(dao.insertContinent(cont1));
	}

}
