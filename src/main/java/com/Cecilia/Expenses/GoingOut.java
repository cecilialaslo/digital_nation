package com.Cecilia.Expenses;

public class GoingOut {
	public int id;
	public String product;
	public double price;
	
	public GoingOut(int id, String product, double price) {
		super();
		this.id = id;
		this.product = product;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "GoingOut [id=" + id + ", product=" + product + ", price=" + price + "]";
	}
	
	
	
	
	
	
	

}
