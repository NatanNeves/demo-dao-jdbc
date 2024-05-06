package app;

import java.util.Locale;

import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
	
		SellerDao sellerDao = DaoFactory.createSellerDao();
	}

}
