package application;

import java.util.Scanner;
import entities.Triangle;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Insira as medidas do triangulo X: ");
		System.out.print("Medida a: ");
		x.a = scan.nextDouble();
		System.out.print("Medida b: ");
		x.b = scan.nextDouble();
		System.out.print("Medida c: ");
		x.c = scan.nextDouble();

		System.out.println("Insira as medidas do triangulo Y: ");
		System.out.print("Medida a1: ");
		y.a = scan.nextDouble();
		System.out.print("Medida b1: ");
		y.b = scan.nextDouble();
		System.out.print("Medida c1: ");
		y.c = scan.nextDouble();

		System.out.printf("A area do triangulo X eh: %.2f%n", x.area());

		System.out.printf("A area do triangulo Y eh: %.2f%n", y.area());

		if (x.area() > y.area()) {
			System.out.println("Triangulo X tem a area maior!");
		} else {
			System.out.println("Triangulo Y tem a area maior!");
		}

		scan.close();
	}

}
