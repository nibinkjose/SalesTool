package com.sales;

public class Main {
	public static void main(String args[])
	{
		SalesData data = new SalesData();
		displayGreeting();
		data.display();
		
	}
	private static void displayGreeting()
	{
		System.out.println("welcome sales peopeles");
		System.out.println("this APP show the sales data");
		System.out.println("first update after push");
		System.out.println("push 1.2");
		System.out.println("push 1.3");
	}

}
