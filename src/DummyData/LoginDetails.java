package DummyData;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

import entities.Employee;

//import entities.Employee;

public class LoginDetails {
	
		/*
		Method to generate an array list of Employee and populates with dummy data
		Returns list of Employees dummyEmployees
		 */
		public List<Employee> generateDummyEmployees() {
			
			
			ArrayList<Employee> dummyEmployees = new ArrayList<>();
			
			dummyEmployees.add(new Employee(2, "Ainslee Murdock", "Inventory Manager", "Warehouse", "amurdock", "password"));
			dummyEmployees.add(new Employee(4, "Iwona Samuelson", "Account representative", "Accounting", "isamuelson", "password"));
			dummyEmployees.add(new Employee(3, "Oswald Sarka", "Salesperson", "Sales", "osarka", "password"));
			dummyEmployees.add(new Employee(1, "Wibo Amsing", "Warehouse Operative", "Warehouse", "wamsing", "password"));
			
			
			//This message shows that GenerateInventory has been successfully called
			System.out.println("dummy employee data created");
			
			return dummyEmployees;
		}
	

}
