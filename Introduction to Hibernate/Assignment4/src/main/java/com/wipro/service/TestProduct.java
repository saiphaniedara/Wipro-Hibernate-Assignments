package com.wipro.service;

import com.wipro.DAO.ProductDAO;
import com.wipro.bean.Product;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductDAO pd = new ProductDAO();
		Product p1 = new Product("Iphone",50000);
		System.out.println(pd.insertProduct(p1));
		Product p2 = new Product("Nokia",15000);
		System.out.println(pd.insertProduct(p2));
		Product p3 = new Product("Samsung",13000);
		System.out.println(pd.insertProduct(p3));
		Product p4 = new Product("Redmi",10000);
		System.out.println(pd.insertProduct(p4));
		Product p5 = new Product("Realme",5000);
		System.out.println(pd.insertProduct(p5));
	}
}
