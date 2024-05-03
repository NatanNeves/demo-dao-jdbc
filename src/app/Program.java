package app;

import java.util.Date;
import java.util.Locale;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Seller sel = new Seller(1, "natan", "natan@gmail.com", new Date(), 3000.0, new Department(1, "books"));
		
		

		System.out.print(sel);
	}

}
