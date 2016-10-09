package IoT;

public class Candy extends DessertItem {
	private double quantity;
	private int total_price;
	private String name;
	Checkout check = new Checkout();
	public Candy(String name ,double quantity ,int price) {
		// TODO Auto-generated constructor stub
		this.quantity = quantity;
		this.total_price = price;
		this.name = name;
		super.name = "Candy";
	}
	int getCost( ){
		int final_cost=0;
		final_cost =(int)(quantity * total_price);
		return final_cost;
	}

	String generate_string()
	{

		String p_str = "";

		String strQuantity = Double.toString(quantity);
		String quant = check.format(strQuantity);
		p_str = p_str + quant +" @ ";
		p_str = p_str + " "+check.format(DessertShoppe.cents2dollarsAndCents(total_price)) +"/lb \t\t\t\t\n";
		p_str = p_str + check.formatname(name);
		return p_str;

	}

}
