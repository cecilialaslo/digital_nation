package com.Cecilia.Expenses;

public enum ExpenseType {
	FOOD ("Food"),
	GIFT ("Gift"),
	GOINGOUT ("Going out"),
	HOUSEITEM ("House item"),
	MEDICAL ("Medical"),
	SELFIMPROVEMENT ("Self-improvement"),
	UTILITIES ("Utilities");
	
	private final String name;
	
	ExpenseType(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
