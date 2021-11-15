package assis2;

import java.util.Scanner;

public class Dessertshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String role= "";
		System.out.println("enter your role owner or customer");
		role=sc.nextLine();
		if(role.equals("owner"))
		{
			owner();
		}else if(role.equals("customer"))
		{
			customer();
		}
	}
	public static void owner()
	{
		Scanner sc = new Scanner(System.in);
		String add="";
		System.out.println("welcome owner");
		System.out.println("please add your items");
		System.out.println("1.Candy\n 2.Cookie\n 3.Icecream");
		System.out.println("Thank you");
		add = sc.nextLine();
		if(add.equals("Candy"))
		{
			System.out.println("candy added to shop");
		}else if(add.equals("Cookie"))
		{
			System.out.println("cookie added to shop");
		}else if(add.equals("Icecream"))
		{
			System.out.println("icecream added to shop");
		}
	}
	public static void customer()
	{
		Scanner sc = new Scanner(System.in);
		String order="";
		System.out.println("welcome owner");
		System.out.println("please place your order");
		Dessertitem dessertItem = new Icecream(400,12);
		dessertItem.getCost();
		new Candy(3,12).getCost();
		new Cookie(3,8).getCost();
		System.out.println("1.Candy\n 2.Cookie\n 3.Icecream");
		System.out.println("Thank you");
		order = sc.nextLine();
		if(order.equals("Candy"))
		{
			System.out.println("order placed for candy");
		}else if(order.equals("Cookie"))
		{
			System.out.println("order placed for cookie");
		}else if(order.equals("Icecream"))
		{
			System.out.println("order placed for icecream");
		}
	}

}
