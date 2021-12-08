package com.Cecilia.Expenses;

public class GoingOut extends Expenses {
	
	public GoingOut(String product, double price) {
		super(product, price);
	}

	@Override
	public String toString() {
		return "GoingOut [product=" + product + ", price=" + price + "]";
	}
	
		
}