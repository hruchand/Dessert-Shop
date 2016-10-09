package IoT;

public class IceCream extends DessertItem {
	private int price;
	private String name;
	Checkout check = new Checkout();
	public IceCream() {
		// TODO Auto-generated constructor stub
	}

	public IceCream(String name, int price) {
		// TODO Auto-generated constructor stub
		this.price = price;
		this.name = name;
		super.name = "Icecream";
	}

	int getCost(){
		return price;
	}

	String generate_string()
	{
		String p_str = "";
		p_str = p_str + check.formatname(name);


		return p_str;

	}

}
