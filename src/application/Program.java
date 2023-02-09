package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "books");
		
		Seller seller = new Seller(21, "bob", "bob@gmail.com", new Date(), 3000.0, obj);
		
		SellerDao sellerDao = DaoFactory.crateSellerDao(); //dessa forma o eu programa nao cohece a implementação ele sonhece somente a interface 
		System.out.println(seller);
		

	}

}
