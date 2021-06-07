package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.CadEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<CadEmployee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registrered: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("\nEmployee %d:%n", i+1);
			System.out.print("ID: ");
			Integer id = sc.nextInt();
				for(CadEmployee x : list) {
					while(x.getId() == id) {
						System.out.print("Digite uma id valida: ");
						id = sc.nextInt();
					}
				}
			System.out.print("NAME: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("SALARY: ");
			Double salary = sc.nextDouble();
			list.add(new CadEmployee(id, name, salary));
		}
		
		System.out.print("\nEnter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		for(CadEmployee x : list) {
			if(id == x.getId()) {
					System.out.print("Enter the percentage: ");
					Double percentage = sc.nextDouble();
					x.salaryBonus(percentage);
			}
		}
		
		System.out.println("\nList of employees:");
		for(CadEmployee x : list) {
			System.out.println(x);
		}
		
		sc.close();

	}

}
