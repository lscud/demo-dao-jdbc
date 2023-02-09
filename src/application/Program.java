package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao(); //dessa forma o eu programa nao cohece a implementação ele sonhece somente a interface
		
		System.out.println("=== TEST 1: seller findById ======== ");
		Seller seller = sellerDao.findById(3); 
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartmentId ======== ");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: seller findAll ======== ");
		list = sellerDao.finddAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: seller Insert ======== ");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n=== TEST 5: seller Insert ======== ");
		seller = sellerDao.findById(1);
		seller.setName("MArta Waine");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
	}

}
