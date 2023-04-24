package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();

		System.out.print("Name: ");
		employee.name = sc.next();

		System.out.print("Gross Salary: $ ");
		employee.GrossSalary = sc.nextDouble();

		System.out.print("Tax: $ ");
		employee.tax = sc.nextDouble();

		System.out.println("Employee: " + employee);

		System.out.println();
		System.out.print("Wich percentage to increase salary? ");
		double percentage = sc.nextDouble();

		employee.increaseSalary(percentage);

		System.out.println();
		System.out.println("Updated Data: " + employee);

		sc.close();
	}

}