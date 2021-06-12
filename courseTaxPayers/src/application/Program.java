package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Contributor;
import entities.IndividualEntity;
import entities.LegalEntity;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Contributor> contributorList = new ArrayList<Contributor>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #"+i+" data:");
			System.out.print("Individual or company (i/c)? ");
			char choice = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double annualIncome = sc.nextDouble();
			
			if(choice == 'i') {
				System.out.print("Health expenditures: ");
				Double healthSpend = sc.nextDouble();
				contributorList.add(new IndividualEntity(name, annualIncome, healthSpend));
			} else {
				System.out.print("Number of employee: ");
				Integer empNumber = sc.nextInt();
				contributorList.add(new LegalEntity(name, annualIncome, empNumber));
			}
		}
		
		System.out.println("\nTAXES PAID:");
		
		for(Contributor contri : contributorList) {
			System.out.println(
					contri.getName() 
					+": $ "
					+ String.format("%.2f", contri.taxCalc()));
		}
		
		double totalTax = 0.0;
		for(Contributor contri : contributorList) {
			totalTax += contri.taxCalc();
		}
		
		System.out.println("\nTOTAL TAXES: $ "+String.format("%.2f", totalTax));
		
		sc.close();
	}

}
