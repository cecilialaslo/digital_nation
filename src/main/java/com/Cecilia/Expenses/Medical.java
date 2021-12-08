package com.Cecilia.Expenses;

import org.springframework.stereotype.Component;


public class Medical extends Expenses {
	
	public Medical(String product, double price) {
		super(product, price);
	}
	
	@Override
	public String toString() {
		return "Medical [product=" + product + ", price=" + price + "]";
	}
	
		
}