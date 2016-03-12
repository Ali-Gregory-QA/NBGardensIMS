package ims;

import java.util.Scanner;

public class InventoryManager {

	public static void InventoryManager() {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Welcome to the Inventory Manager portal.");
		System.out.println( "Input menu number for option:");
		System.out.println( "1. Add a new product");
		System.out.println( "2. Swap to warehouse employee view");
		
		//Should use an int or char
		String menuOption = keyboard.next();
		
		switch(menuOption){
		case "1" :
			addNewProduct();
			break;
		case "2" :
			WarehouseWorker.WarehouseWorker();
			break;
		default : 
			System.out.println( "Input not recognised");
		}
		
		
	}
	
	public void addNewProduct() {
		Scanner keyboard = new Scanner (System.in);
		//Create instance of product
		Product newProduct = new Product();		
		//Populate instance of product from user inputs
		System.out.print( "Input product ID");
		newProduct.product_ID = keyboard.nextInt();
		System.out.print( "Input product name");
		newProduct.productName = keyboard.next();
		System.out.print( "Input product quantity");
		newProduct.quantity = keyboard.nextInt();
		System.out.print( "Input product price");
		//needs setting up for float inputs ------------------------<<--
		newProduct.price = keyboard.next();
		char discon;
		do{
			System.out.print( "Is product discontinued? (y/n)");
			discon = keyboard.findWithinHorizon(".", 0).charAt(0);
		} while (discon != 'y' && discon != 'n');
		if (discon == 'y'){
			newProduct.discontinued = true;
		} else {
			newProduct.discontinued = false;
		}
		//needs setting up for char/boolean inputs ------------------------<<--
		newProduct.discontinued
		System.out.print( "Input damaged product quantity");
		newProduct.damagedQuantity = keyboard.nextInt();
		
		
		System.out.println( "Inserting records into the table...");
		stmt = conn.createStatement();
		String sql = "INSERT INTO Languages " + "VALUES (1, 'Java', 1992)";
		stmt.executeUpdate(sql);
		System.out.println( "Inserted records into the table...");
		
	}

}
