package com.Cecilia.Expenses;

public class SelfImprovement extends Expenses {
	
	public SelfImprovement(String product, double price) {
		super(product, price);
	}

	@Override
	public String toString() {
		return "SelfImprovement [product=" + product + ", price=" + price + "]";
	}
	
		

}
