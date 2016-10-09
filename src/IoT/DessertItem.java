package IoT;


public abstract class DessertItem {

	protected  String name;


	public void setName(String name) {
		this.name = name;
	}
	public DessertItem() {
		this("");
	}
	/**
	 * Initializes DessertItem data
	 */   
	public DessertItem(String name) {
		if (name.length() <= DessertShoppe.MAX_ITEM_NAME_SIZE)
			this.name = name;
		else 
			this.name = name.substring(0,DessertShoppe.MAX_ITEM_NAME_SIZE);
	}


	public final String getName() {
		return name;
	}
	/**
	 * Returns cost of DessertItem
	 * @return cost of DessertItem
	 */  
	abstract int getCost();

	abstract String generate_string();

}




