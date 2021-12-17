package com.Cecilia.Expenses;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpensesService {
	
	@Autowired
	ExpensesRepo expensesRepo;

	public List<Expenses> listTable() {
		List<Expenses> findAll = expensesRepo.findAll();
		
		return findAll;
		
	}
	
	public void addinTable(Expenses e) {
		expensesRepo.save(e);
		
	}
	

	public void deleteFromTable(Long id) {
		expensesRepo.deleteById(id);
	}

	public Expenses findById(Long id) {
		Optional<Expenses> findById = expensesRepo.findById(id);
		
		if (findById.isEmpty()) {
			return null;
		} else {
			return findById.get();
		}
		}
 }
