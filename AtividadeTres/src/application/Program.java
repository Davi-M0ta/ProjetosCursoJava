package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("Name: ");
		student.name = sc.next();
		
		System.out.print("Grade One: ");
		student.gradeOne = sc.nextDouble();
		
		System.out.print("Grade Two: ");
		student.gradeTwo = sc.nextDouble();

		System.out.print("Grade Three: ");
		student.gradeThree = sc.nextDouble();
		
		student.checkStatus();
		
		sc.close();
	}

}
