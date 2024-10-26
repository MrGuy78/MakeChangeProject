package makechange;

import java.util.Scanner;

public class CashRegister {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the price of the item: ");
			double price = sc.nextDouble();
			
		System.out.println("Please enter the amount tendered: ");
			double amount = sc.nextDouble();
			
		calcChange(price, amount);
		
		sc.close();
	}
	public static void calcChange(double price, double amount) {
		double result = 0.0;
		if(price > amount) {
			System.out.println("Insufficient funds. ");
		}
		else if(price == amount) {
			System.out.println("Thank you. ");
		}
		else {
			double change = (amount - price);
		}
	}
	
}
