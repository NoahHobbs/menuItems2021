package dmacc.beans;

public class Menu {
	private long id;
	private String itemName;
	private int calories;
	private double price;
	
	public Menu() {
		super();
		this.itemName = "Pepperoni Pizza";
	}

	public Menu(String itemName, double price) {
		super();
		this.itemName = itemName;
		this.price = price;
	}

	public Menu(String itemName, int calories, double price) {
		super();
		this.itemName = itemName;
		this.calories = calories;
		this.price = price;
	}

	public Menu(long id, String itemName, int calories, double price) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.calories = calories;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", itemName=" + itemName + ", calories=" + calories + ", price=" + price + "]";
	}
	
	
	
}
