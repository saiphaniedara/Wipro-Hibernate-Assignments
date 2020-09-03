package com.wipro.bean;

public class Product {
	private String productName;
	private int productId;
	private int price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productName, int price) {
		super();
		this.productName = productName;
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productId=" + productId + ", price=" + price + "]";
	}
}
