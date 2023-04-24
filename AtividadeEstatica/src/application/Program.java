package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double money = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais: R$ %.2f", CurrencyConverter.convertMoney(price, money));
		
		sc.close();
	}

}
