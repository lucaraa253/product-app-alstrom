package com.training.pms;

import java.util.Scanner;

import com.training.pms.dao.ProductDAO;
import com.training.pms.dao.ProductDAOImpl;
import com.training.pms.model.Product;

public class ProductApp {
	
	Scanner scanner = new Scanner(System.in);
	
	int choice = 0;
	
	Product product = new Product();
	
	ProductDAO productDAO = new ProductDAOImpl();
	
	public void startProductApp() {
		
//		Declaring Local variables for input
		int productId = 0;
		String productName = null;
		int quantityOnHand= 0;
		int price = 0;
		
		
		
//		While loop so you can keep running code
		while(true) {
			
		
		
		System.out.println("P R O D U C T    -     APP       M E N U");
		
		System.out.println("1. Add product ");
		System.out.println("2. Delete product ");
		System.out.println("3. Update product ");
		System.out.println("4. Search by ID ");
		System.out.println("5. Search by name ");
		System.out.println("6. Print all products ");
		System.out.println("9. E X I T ");
		
		System.out.println("Please enter your choice");
		choice = scanner.nextInt();
		
		
		
		switch (choice) {
//		This will only allow you to choose choice number 1
		case 1:
//			Add product section
			System.out.println("Welcome to Add product section");
			
//			Take input from user to add product
			System.out.println("Please enter product ID : ");
			productId = scanner.nextInt();
			
			System.out.println("Please enter product Name : ");
			productName = scanner.next();
			
			System.out.println("Please enter product quantity on hand : ");
			quantityOnHand = scanner.nextInt();
			
			System.out.println("Please enter product price : ");
			price = scanner.nextInt();
			
			product = new Product(productId, productName, quantityOnHand, price);
			productDAO.addProduct(product);
			
			System.out.println("Congrats your product " + productName + " was created");
			
			break;
		case 2:
//			Add product section
			System.out.println("Welcome to Add product section");
			
//			Take input from user to add product
			System.out.println("Please enter product ID to delete : ");
			productId = scanner.nextInt();
			
			productId = 0;
			productName = null;
			quantityOnHand = 0;
			price = 0;
			
			
			product = new Product(productId, productName, quantityOnHand, price);
			productDAO.deleteProduct(productId);
			
			System.out.println("Congrats your product was deleted");
			System.out.println("Just to be sure : " + product);
			break;
		case 3:
//			Add product section
			System.out.println("Welcome to Add product section");
			
//			Take input from user to add product
			System.out.println("Please enter product ID to update : ");
			productId = scanner.nextInt();
			
			System.out.println("Please enter product Name : ");
			productName = scanner.next();
			
			System.out.println("Please enter product quantity on hand : ");
			quantityOnHand = scanner.nextInt();
			
			System.out.println("Please enter product price : ");
			price = scanner.nextInt();
			
			product = new Product(productId, productName, quantityOnHand, price);
			productDAO.updateProduct(product);
			
			System.out.println("Congrats your product " + productName + " was created");
			
			break;
		case 9: System.out.println("Thanks for using my product app");
				System.exit(0);

		default:
			System.out.println("Invalid choice, please enter (1-6) or 9 to exit");
			break;
		}
		}
		
	}

}
