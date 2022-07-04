package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		
		System.out.println(obj);
		System.out.println("-*-*-*-*-*-*-*-*-*");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3.000, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);
	}

}
