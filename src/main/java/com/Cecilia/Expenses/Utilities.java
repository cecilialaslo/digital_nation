package com.Cecilia.Expenses;

public class Utilities extends Expenses {

	public Utilities(String product, double price) {
		super(product, price);
	}


	@Override
	public String toString() {
		return "Utilities [product=" + product + ", price=" + price + "]";
	}
	
		
}