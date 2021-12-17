package com.Cecilia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;

import com.Cecilia.Expenses.ExpenseType;
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
		
		//Aici e locul unde adaug in model valorile din enum-ul ExpenseType, ca sa le pot integra in form template?
		model.addAttribute("expenseType", ExpenseType.values());
		return "addExpense"; 
		//poti verifica, te rog, daca am scris corect template-ul addExpense?
		// am dubii despre th:object="${allExpenses}, de pe linia 8, si tot ce e in tag-ul Select. 
	}
		
	@RequestMapping(value="/addExpense", method = {RequestMethod.POST, RequestMethod.GET})
	public String addExpense(@RequestParam(name="product", required = true) String product,
							@RequestParam(name="price", required = false) Double price,
							Model model)  {
		
		expensesService.addinTable(new Expenses(product, price));
		
		
		return "redirect:getExpenses";				
		
	}
	
	
	@RequestMapping(value="/addbread", method = RequestMethod.GET)
	public String addBread() {
		Expenses a = new Expenses ("bread", 5.00);
		expensesService.addinTable(a);
		return "redirect:getExpenses";	
	}
	
	
	@RequestMapping(value="/find", method = RequestMethod.GET)
	public String findById(@RequestParam(value="id") Long id,
							Model model) {
		Expenses e = expensesService.findById(id);
		model.addAttribute("selectedProduct", e);
		return "selectedProduct"; 
			
	}
	
	@RequestMapping(value="/delete/{id}", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(@PathVariable Long id) {
		expensesService.deleteFromTable(id);
		
		return  "redirect:/getExpenses";	
	}

	
	
	

	
	
}



