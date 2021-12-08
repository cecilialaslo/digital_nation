package com.Cecilia.Expenses;

import org.springframework.stereotype.Component;

@Component
public abstract class Expenses {
	public String product;
	public Double price;
	

	public Expenses(String product, double price) {
		super();
		this.product = product;
		this.price = price;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Expenses [product=" + product + ", price=" + price + "]";
	}

	

	

	
	
	
	
	
}
