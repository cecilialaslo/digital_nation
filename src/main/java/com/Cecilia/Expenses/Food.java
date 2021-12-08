package com.Cecilia.Expenses;

public class Food extends Expenses {
	
	public Food(String product, double price) {
		super(product, price);
	}

	@Override
	public String toString() {
		return "Food [product=" + product + ", price=" + price + "]";
	}
	
		
}