package com.Cecilia.Expenses;

public class Gifts extends Expenses {

	public Gifts(String product, double price) {
		super(product, price);
	}

	@Override
	public String toString() {
		return "Gifts [product=" + product + ", price=" + price + "]";
	}
	
		
}