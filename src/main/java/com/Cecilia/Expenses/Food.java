package com.Cecilia.Expenses;

public class Food {
	public int id;
	public String product;
	public double price;
	
	
	public Food(int id, String product, double price) {
		super();
		this.id = id;
		this.product = product;
		this.price = price;
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

	public int getID() {
		return id;
	}

	public void setID(int iD) {
		id = iD;
	}
	
	@Override
	public String toString() {
		return "Food [id=" + id + ", product=" + product + ", price=" + price + "]";
	}
	
	
	
	

}
