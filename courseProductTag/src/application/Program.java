package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Product> productList = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Product #"+i+" data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char choice = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			switch(choice) {
				case 'i':
					System.out.print("Customs fee: ");
					Double customsFee = sc.nextDouble();
					productList.add(new ImportedProduct(name, price, customsFee));
					break;
				case 'c':
					productList.add(new Product(name, price));
					break;
				case 'u':
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					Date manufactureDate = sdf.parse(sc.next());
					productList.add(new UsedProduct(name, price, manufactureDate));
					break;
				default:
					System.out.println("Invalid choice!");
			}
		}
		
		System.out.println("PRICE TAGS:");
		
		for(Product prod : productList) {
			System.out.println(prod.priceTag());
		}
		
		
		sc.close();

	}

}
