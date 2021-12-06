package com.Cecilia.Expenses;

public class Food extends Expenses {
	public String product;
	public double price;
	
	public Food(String product, double price) {
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
		return "Food [product=" + product + ", price=" + price + "]";
	}
	
		
}