package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Employee #"+i+" data:");
			System.out.print("Outsourced (y/n) ? ");
			char choice = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour:");
			Double valuePerHour = sc.nextDouble();
			if(choice == 'y') {
				System.out.print("Additional charge: ");
				Double addCharge = sc.nextDouble();
				list.add(new OutsourceEmployee(name, hours, valuePerHour, addCharge));
			} else {
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		
		System.out.println("\nPAYMENTS:");
		for(Employee emp : list) {
			System.out.println(emp.getName()+" - $"+String.format("%.2f", emp.payment()));
		}
		
		
		
		
		
		
		sc.close();
	}

}
