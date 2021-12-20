package com.Cecilia.Expenses;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ExpensesRepo extends JpaRepository<Expenses, Long> {
	
	@Query(value="SELECT SUM(price) FROM Expenses")
	Double totalPrice();

	public List<Expenses> getByExpenseType(String expenseType);


	
}
