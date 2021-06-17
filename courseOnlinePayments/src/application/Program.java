package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installments;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number =  sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double contractvalue = sc.nextDouble();
		System.out.print("Enter number of installments: ");
		int installments = sc.nextInt();
		
		Contract contract = new Contract(number, date, contractvalue);
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, installments);
		
		
		System.out.println("Installments:");
		for( Installments x : contract.getInstallments()) {
			System.out.println(x);
		}
		
		
		
		sc.close();
		
	}

}
