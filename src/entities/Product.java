package entities;

public class Product {
	int product_ID;
	String productName;
	int quantity;
	float price;
	boolean discontinued;
	int damagedQuantity;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getProduct_ID() {
		return product_ID;
	}

	public void setProduct_ID(int product_ID) {
		this.product_ID = product_ID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isDiscontinued() {
		return discontinued;
	}

	public void setDiscontinued(boolean discontinued) {
		this.discontinued = discontinued;
	}

	public int getDamagedQuantity() {
		return damagedQuantity;
	}

	public void setDamagedQuantity(int damagedQuantity) {
		this.damagedQuantity = damagedQuantity;
	}
	
}
