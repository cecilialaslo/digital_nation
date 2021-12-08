package com.Cecilia.Expenses;

public class HouseItems extends Expenses {
	
	public HouseItems(String product, double price) {
		super(product, price);
	}

	@Override
	public String toString() {
		return "HouseItem [product=" + product + ", price=" + price + "]";
	}
	
		
}