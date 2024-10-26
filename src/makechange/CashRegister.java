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
		if (price > amount) {
			System.out.println("Insufficient funds. ");
		} else if (price == amount) {
			System.out.println("Thank you. ");
		} else {
			double change = (amount - price);
			System.out.println(change);
			if (change > 20) {
				int numOf20s = (int) (change / 20);
				if (numOf20s > 0) {
					System.out.println(numOf20s + " twenties.");
					change = (change % 20);
				}

			}
			if (change > 10) {
				int numOf10s = (int) (change / 10);
				if (numOf10s > 0) {
					System.out.println(numOf10s + " tens.");
					change = (change % 10);
				}

			}
			if (change > 5) {
				int numOf5s = (int) (change / 5);
				if (numOf5s > 0) {
					System.out.println(numOf5s + " fives.");
					change = (change % 5);
				}

			}
			if (change > 1) {
				int numOf1s = (int) (change / 1);
				if (numOf1s > 0) {
					System.out.println(numOf1s + " ones.");
					change = (change % 1);
				}

			}
			if (change > 0.25) {
				int numOfQuarters = (int) (change / 0.25);
				if (numOfQuarters > 0) {
					System.out.println(numOfQuarters + " quarters.");
					change = (change % 0.25);
				}

			}
			if (change > 0.10) {
				int numOfDimes = (int) (change / 0.10);
				if (numOfDimes > 0) {
					System.out.println(numOfDimes + " dimes.");
					change = (change % 0.10);
				}

			}
			if (change > 0.05) {
				int numOfNickels = (int) (change / 0.05);
				if (numOfNickels > 0) {
					System.out.println(numOfNickels + " Nickels.");
					change = (change % 0.05);
				}

			}
			if (change > 0.01) {
				int numOfPennies = (int) (change / 20);
				if (numOfPennies > 0) {
					System.out.println(numOfPennies + " pennies.");
					change = (change % 0.01);
				}

			}
		}
	}

}
