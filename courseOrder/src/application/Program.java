package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY: ");
		Date birthDate = sdf.parse(sc.next());
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		sc.nextLine();
		String status = sc.nextLine();
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
		
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter #"+i+" item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer productQuantity = sc.nextInt();
			Product product = new Product(productName, productPrice);
			order.addItem(new OrderItem(productQuantity, product));
			
		}

		System.out.println("\nORDER SUMARY:");
		System.out.println(order);
		
		
		
		sc.close();

	}

}
