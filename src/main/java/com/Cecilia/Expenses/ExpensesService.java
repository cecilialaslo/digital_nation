package com.Cecilia.Expenses;

import java.util.List;

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
	
	public void deletefromTable(Long id) {
		expensesRepo.deleteById(id);
	}
	
	//Cred ca aici ar trebui sa ii pun return, dar nu stiu care e valoarea de return pt o data din repository.
	public void findById(Long id) {
		expensesRepo.findById(id).get();
		 
		}
 }
