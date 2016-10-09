package IoT;

import java.util.Vector;

public class Checkout {
	Vector<DessertItem> Register = new Vector<DessertItem>();
	DessertShoppe dessert_tax = new DessertShoppe();
	public Checkout() {
		// TODO Auto-generated constructor stub
	}

	public void clear(){
		Register.clear();

	}

	public void enterItem(DessertItem item){
		Register.add(item);

	}

	public int numberOfItems(){
		return Register.size();

	}

	public java.lang.String toString(){
		String print_receipt = DessertShoppe.STORE_NAME+"\n";
		print_receipt = print_receipt + "---------------------\n";
		for (int i=0;i<Register.size();i++)
		{
			print_receipt = print_receipt + Register.get(i).generate_string()+"";
			print_receipt = print_receipt + "\t\t"+format(DessertShoppe.cents2dollarsAndCents(Register.get(i).getCost()))+"\n";

		}
		int t_Cost=totalCost();
		int t_Tax=totalTax(t_Cost);
		print_receipt = print_receipt+"Tax  \t\t\t\t\t" + format(DessertShoppe.cents2dollarsAndCents(t_Tax)) +"\n";
		print_receipt = print_receipt +"Total\t\t\t\t\t" +format(DessertShoppe.cents2dollarsAndCents((t_Cost+t_Tax)))+"\n";



		return print_receipt;

	}

	public int totalCost(){
		int total = 0;
		for(int i=0; i<Register.size();i++)
			total = total + Register.get(i).getCost();
		return total;

	}

	public int totalTax(int total1){
		int total_tax=0;
		total_tax =(int)((total1 * DessertShoppe.TAX_RATE)/100);
		return total_tax;

	}

	public String format(String value)
	{
		int len = value.length();
		for(int j = 0 ; j < DessertShoppe.COST_WIDTH-len;j++)
		{
			value = value+" ";
		}
		return value;
	}
	public String formatname(String name)
	{
		int len = name.length();
		for(int i =0; i<DessertShoppe.MAX_ITEM_NAME_SIZE - len;i++)
		{
			name = name+" ";
		}
		return name;
	}

}
