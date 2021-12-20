package com.Cecilia.Expenses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Expenses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	private String product;
	
	
	private Double price;
	
	@Column
	private String expenseType;
		
		
	public Expenses(String product, Double price, String expenseType) {
		super();
		this.product = product;
		this.price = price;
		this.expenseType = expenseType;
		
		
	}



	public Expenses() {
	}
	
	

	public String getExpenseType() {
		return expenseType;
	}



	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
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
		return "Expenses [id=" + id + ", product=" + product + ", price=" + price + ", expenseType=" + expenseType
				+ "]";
	}

	
	

//
//	@Override
//	public String toString() {
//		return "Expenses [id=" + id + ", product=" + product + ", price=" + price + ", type=" + expenseType + "]";
//	}

	

	

	
	
	

	
	
	

	

	

	

	
	
	
	
	
}
