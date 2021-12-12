package com.Cecilia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;

import com.Cecilia.Expenses.Expenses;
import com.Cecilia.Expenses.ExpensesRepo;
import com.Cecilia.Expenses.ExpensesService;


//Ca sa fie toate comentariile intr-o singura clasa, adaug aici si intrebare despre constructorul clasei Expenses:
//In Expenses, am adaugat un field enum expenseType  -- dar nu cred ca pot (sau nu stiu) sa adaug enum in constructor.
// Mentionez ca vreau sa folosesc enum-ul respectiv pentru a crea metoda addExpense din Controller un drop-down menu cu 7 tipuri de cheltuieli din care sa aleaga userul. 

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
		
		return "viewExpenses"; //^asa se leaga baza de date de file-ul html, adaugand-o in Model?
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET) 
	public String add(Model model) {
		return "addExpense";
	}
	
	//Nu functioneaza /addExpense -- nu imi adauga cheltuielile in baza de date. Trebuie readaugata lista (listTabel) in model si in interiorul metodei asteia? 
	//In plus, cum pot face aici, in /addExpense, ca aplicatia sa-mi autogenereze un id, si sa nu-i mai cer userului sa-l introduca el?
	@RequestMapping(value="/addExpense", method = RequestMethod.POST)
	public String addExpense(@RequestParam(name="product", required = true) String product,
							@RequestParam(name="price", required = false) Double price,
							@RequestParam(value = "id", defaultValue ="1") Long id, 
							Model model)  {
		
		expensesService.addinTable(new Expenses(id, product, price));
		
		return "redirect:viewExpenses";				
		
	}
	
	//Am creat metoda addBread doar ca sa verific din consola H2 daca imi adauga entry-ul asta in tabel, dar nu pare sa-l adauage.
	@RequestMapping(value="/addbread", method = RequestMethod.GET)
	public String addBread() {
		Expenses a = new Expenses (1l, "bread", 5.00);
		expensesService.addinTable(a);
		return "redirect:viewExpenses";	
	}
	
	
	//Daca nu ii fac Thymeleaf template, ce valoare de return trebuie sa pun aici? N-am stiut nici ce return sa dau nici metodei findById din ExpensesService.
	@RequestMapping(value="/findById", method = RequestMethod.GET)
	public String findById(@RequestParam(value="id") Long id) {
		expensesService.findById(id);
		return ???
	}
	
	
	@RequestMapping(value="deleteById", method = RequestMethod.DELETE)
	public String deleteById(@RequestParam(value="id") Long id) {
		expensesService.deletefromTable(id);
		
		return "redirect:viewExpenses";	
	}
	
}



