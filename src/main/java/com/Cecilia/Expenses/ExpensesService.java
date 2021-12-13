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
	
	public void deletefromTable(Long id) {
		expensesRepo.deleteById(id);
	}
	
	//Cred ca aici ar trebui sa ii pun return, dar nu stiu care e valoarea de return pt o data din repository.
	//Ar trebui sa fie tipul clasei pt care am construit repository-ul
	//De exemplu la findAll returnam o lista de expenses
	public Expenses findById(Long id) {
		Optional<Expenses> findById = expensesRepo.findById(id);
		/*Daca nu stii tipul unei variabile poti face 2 lucruri:
			- intri pe metoda sa vezi ce returneaza: Optional<T> findById(ID id);
			- selectezi si dai click dreapta>refactor>create local variable (si iti creaza eclipse o variabila cu tipul)
		*/
		 //Apoi trebuia sa vezi ce face Optional (Ctrl click pe el)
		if (findById.isEmpty()) {
			return null;
		} else {
			return findById.get();
		}
		}
 }
