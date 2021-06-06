package application;

import java.util.Locale;
import java.util.Scanner;
import entities.CadRoom;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		CadRoom[] vect = new CadRoom[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		if(n > 0 && n <= 10) {
			for(int i = 0; i < n; i++) {
				System.out.printf("\nRent #%d:%n",i+1);
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Email: ");
				String email = sc.nextLine();
				System.out.print("Room: ");
				int room = sc.nextInt();
				vect[room] = new CadRoom(name, email);
			}
		}
		
		System.out.println("\nBusy rooms:");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": "+ vect[i]);
			}
		}
		
		sc.close();
	}

}
