package com.Cecilia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;


import com.Cecilia.Expenses.Expenses;
import com.Cecilia.Expenses.ExpensesRepo;
import com.Cecilia.Expenses.ExpensesService;


@Controller
public class MyController {
	@Autowired
	ExpensesRepo expensesRepo;
	
	@Autowired
	ExpensesService expensesService;
	
	
	@RequestMapping(value = "/getExpenses", method = RequestMethod.GET)
	public String getExpenses(Model model) {
		List<Expenses> listTable = expensesService.listTable();
		model.addAttribute("allExpenses", listTable);
		
		return "viewExpenses"; 
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET) 
	public String add(Model model) {
		return "addExpense"; 
		
	}

	
	@RequestMapping(value="addExpense", method = {RequestMethod.POST, RequestMethod.GET})
	public String addExpense(@ModelAttribute("expense") Expenses exp) {
		expensesService.addinTable(exp);
		
		return "redirect:/getExpenses";
	}
	
	@RequestMapping(value = "/find", method = RequestMethod.GET) 
	public String find(Model model) {
		return "findById"; 
		
	}
		
	@RequestMapping(value="/findExpense", method = {RequestMethod.POST, RequestMethod.GET})
	public String findById(@RequestParam(value="id") Long id,
							Model model) {
		Expenses e = expensesService.findById(id);
		model.addAttribute("selectedProduct", e);
		return "/selectedProduct"; 
			
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET) 
	public String delete (Model model) {
		return "deleteById"; 
		
	}
		
	@RequestMapping(value="/deleteExpense", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(@RequestParam(value="id") Long id) {
		expensesService.deleteFromTable(id);
		
		return  "redirect:/getExpenses";	
	}

	
	@GetMapping(value="/sum")
	public String getSum(Model model) {
		model.addAttribute("sumTotal",  expensesRepo.totalPrice());
		
		return "sum";
	}
	
	@RequestMapping(value = "/expenses/type/{type}", method = RequestMethod.GET)
	public String getByType(@PathVariable String type, Model model) {
		List<Expenses> expenseType = expensesService.getByType(type);
		model.addAttribute("expenseType", expenseType);
		
		return "expenseByType";

	}
	


	
	
}



