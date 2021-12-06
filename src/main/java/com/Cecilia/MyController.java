package com.Cecilia;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import com.Cecilia.Expenses.Expenses;
import com.Cecilia.Expenses.Food;
import com.Cecilia.Expenses.Gifts;
import com.Cecilia.Expenses.GoingOut;
import com.Cecilia.Expenses.HouseItems;
import com.Cecilia.Expenses.Medical;
import com.Cecilia.Expenses.SelfImprovement;
import com.Cecilia.Expenses.Utilities;

@Controller
public class MyController {
	public ArrayList<Expenses> total= new ArrayList<Expenses>();
	
	// Metoda de mai jos imi afiseaza in browser un tabel gol. Nu imi dau seama ce gresesc. 
	@RequestMapping(value ="/viewExpenses", method = RequestMethod.GET)
	public String allExpenses(Model model) {
		Medical m1 = new Medical("pastile", 20);
		Food f1 = new Food("pizza", 30);
		GoingOut g1 = new GoingOut("bere", 12);
		
		total.add(m1);
		total.add(f1);
		total.add(g1);
		
		model.addAttribute("allExpenses", total);
		
		return "viewExpenses";
	
	}
	
	//Metoda de mai jos imi da in browser eroarea: (type=Method Not Allowed, status=405). Din nou, nu stiu cum s-o corectez 
	@RequestMapping(value="/addExpense", method = RequestMethod.POST)
	public String addExpense(@RequestParam(name="product", required = false) String product,
							@RequestParam(name="price", required = false) double price,
							Model model) {		
		model.addAttribute("product", product);
		model.addAttribute("price", price);
		
		/* Mi-e un pic neclar cum functioneaza model-ul. Pot adauga in el valori de tip String si double, 
		 daca in metoda anterioara (/viewExpense) am adaugat o lista?) */
		
		return "addExpense";
	}
	

}



