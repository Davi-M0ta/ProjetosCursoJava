package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();

		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = sc.next();

		System.out.print("Price: ");
		product.price = sc.nextDouble();

		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();

		System.out.println();
		System.out.println("Product Data: " + product);

		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated Data: " + product);

		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated Data: " + product);

		sc.close();
	}

}
