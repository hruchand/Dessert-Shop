package IoT;

public class Cookie extends DessertItem {
	private int quantity;
	private int total_price;
	private String name;
	Checkout check = new Checkout();
	public Cookie(String name, int quantity, int price_per_dozen) {
		// TODO Auto-generated constructor
		this.quantity = quantity;
		this.total_price = price_per_dozen;
		this.name = name;
		super.name = "Cookie";
	}

	int getCost(){
		int final_cost=0;
		final_cost = (int)((quantity*total_price)/12);

		return final_cost;
	}

	String generate_string()
	{
		String p_str = "";
		String strQuantity = Double.toString(quantity);
		String quant = check.format(strQuantity);
		p_str = p_str + quant +" @ ";
		p_str = p_str + check.format(DessertShoppe.cents2dollarsAndCents(total_price)) +" /dz  \t\t\t\n";
		p_str = p_str + check.formatname(name);
		return p_str;

	}

}
