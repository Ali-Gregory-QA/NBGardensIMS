package entities;

import java.sql.Date;

public abstract class Order {
	int ID;
	Date datePlaced;
	Date dateDelivered;
	OrderStatus orderStatus;
	int createdEmployeeID;
	
	

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public void fetchLastOrderID() {
		// TODO Auto-generated constructor stub
	}

}
