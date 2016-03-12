package ims;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DummyData.LoginDetails;
import entities.Employee;

public class Ims {

	public Ims() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the NB Gardens inventory management system.");
		//New instance of LoginDetails containing dummy Employee data to login
		LoginDetails dummyEmployees = new LoginDetails();
		List<Employee> employees = dummyEmployees.generateDummyEmployees();
		
		String[] department = Ims.logIn(employees);
		
		//If no details returned, message output
		//Else continue to appropriate user portal
		if (department[0] == null) {
			System.out.println("Username or password not recognised");
		} 
		else {
			switch (department[0]){
			case "Warehouse":
				//Check if warehouse user is Inventory manager
				if (department[1].equals("Inventory Manager")) {
					InventoryManager.InventoryManager();
				}
				else {
					WarehouseWorker.WarehouseWorker();
				}
				break;
			case "Accounting":
				AccountsTeam.AccountsTeam();			
				break;
			case "Sales":
				Salesperson.Salesperson();
				break;
			default:
				
				break;
			}
		}
	}
	
	
	public static String[] logIn(List<Employee> employees){
		Scanner keyboard = new Scanner (System.in);
		
		//Receive user input for username and password
		System.out.println("Enter Username:");
		String username = keyboard.next();
		System.out.println("Enter password:");
		String password = keyboard.next();
		String[] departmentRole = new String[2];
		
		//verify username and password against dummy data list
		for (int i=0; i < employees.size(); i++){	
			if (username.equals(employees.get(i).getUsername()) && password.equals(employees.get(i).getPassword())){
				System.out.print("Welcome ");
				System.out.println(employees.get(i).getName());
				departmentRole[0] = employees.get(i).getDepartmentName();
				departmentRole[1] =  employees.get(i).getRoleTitle();
				break;
			}
		}
		//loop through list for username
		return departmentRole;
		
	}
}
