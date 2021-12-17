package com.Cecilia.Expenses;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Expenses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String product;
	private Double price;
	
	private ExpenseType type;
	
	public Expenses(String product, Double price) {
		super();
		this.product = product;
		this.price = price;
	}
	
	public Expenses() {
	}
	
	

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	
		public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Expenses [id=" + id + ", product=" + product + ", price=" + price + "]";
	}
	
	

	

	

	

	
	
	
	
	
}
