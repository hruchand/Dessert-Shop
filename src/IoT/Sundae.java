package IoT;

public class Sundae extends IceCream {
	private int i_price,t_price;
	private String i_name;
	private String t_name;
	Checkout check = new Checkout();
	public Sundae(String icecream_name, int icecream_price,String topping_name,int topping_price) {
		super();
		this.i_price = icecream_price;
		this.t_price = topping_price;
		this.i_name = icecream_name;
		this.t_name = topping_name;
		// TODO Auto-generated constructor stub
	}

	int getCost(){
		int final_cost;
		final_cost = i_price+t_price;
		return final_cost;

	}

	String generate_string()
	{
		String p_str = "";
		p_str = p_str +check.formatname(t_name +" Sundae with    \n");
		p_str = p_str + check.formatname(i_name);
		return p_str;

	}




}
