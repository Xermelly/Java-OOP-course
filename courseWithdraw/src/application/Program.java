package application;

import java.util.Locale;
import java.util.Scanner;
import model.entities.Account;
import model.exceptions.BankException;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		try {
			
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Initial balance: ");
			Double initBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, name, initBalance, withdrawLimit);
			
			System.out.print("\nEnter amount for withdraw: ");
			double withdrawAmount = sc.nextInt();
			account.withdraw(withdrawAmount);
			
			System.out.printf("New balance: %.2f%n", account.getBalance());
			
		} catch(BankException e) {
			System.out.println("Withdraw error: "+ e.getMessage());
		} catch(RuntimeException e) {
			System.out.println("Invalid input");
		} finally {
			sc.close();
		}
	}

}
