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
		total.add(g1); //acum ca merge add poti scoate asta 
		
		model.addAttribute("allExpenses", total);
		
		return "viewExpenses";
	
	}
	
	@RequestMapping(value="/add", method = RequestMethod.GET) //metoda de tip get pentru a obtine view-ul
	public String add(Model model) {		
		/* Mi-e un pic neclar cum functioneaza model-ul. Pot adauga in el valori de tip String si double, 
		 daca in metoda anterioara (/viewExpense) am adaugat o lista?) */
		//da - poti adauga ce Object vrei. face el in spate managementul
		// - dar nu poti adauga valori primitive - de aia am modificat price din double in Double 
		return "addExpense";
	}
	
	//Metoda de mai jos imi da in browser eroarea: (type=Method Not Allowed, status=405). Din nou, nu stiu cum s-o corectez 
	@RequestMapping(value="/addExpense", method = RequestMethod.POST) //metoda post este apelata din template si returneaza alt template
	public String addExpense(@RequestParam(name="product", required = false) String product,
							@RequestParam(name="price", required = false) Double price,
							Model model) {		
		//model.addAttribute("product", product);
		//model.addAttribute("price", price);
		total.add(new Gifts(product, price)); //am adaugat in lista ca sa si vedem. nu stiu daca ai nevoie sa adaugi in model
		/* Mi-e un pic neclar cum functioneaza model-ul. Pot adauga in el valori de tip String si double, 
		 daca in metoda anterioara (/viewExpense) am adaugat o lista?) */
		
		return "redirect:viewExpenses"; //pentru a afisa lista de expenses
	}
	

}



