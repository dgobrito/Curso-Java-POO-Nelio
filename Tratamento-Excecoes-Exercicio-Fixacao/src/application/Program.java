package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.entities.DomainException;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		try {
			System.out.println("Enter account data");
			
			System.out.print("Number: ");
			int number = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			
			System.out.print("Initial balance: ");
			Double initialBalance = sc.nextDouble();
			
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			System.out.println();
			
			Account account = new Account(number, holder, withdrawLimit);
			account.deposit(initialBalance);
			
			System.out.print("Enter amount for withdraw: ");
			double withdraw = sc.nextDouble();		
			account.withdraw(withdraw);
			
			System.out.print(String.format("New balance: %.2f", account.getBalance()));			
		} catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} finally {
			sc.close();			
		}	
	}
}
