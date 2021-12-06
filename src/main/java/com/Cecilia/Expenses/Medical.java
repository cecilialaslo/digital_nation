package com.Cecilia.Expenses;

import org.springframework.stereotype.Component;


public class Medical extends Expenses {
	public String product;
	public double price;
	
	public Medical(String product, double price) {
		super(product, price);
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Medical [product=" + product + ", price=" + price + "]";
	}
	
		
}