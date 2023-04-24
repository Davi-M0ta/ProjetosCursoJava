package entities;

public class Rectangle {

	public double width;
	public double height;

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return (width * 2) + (height * 2);
	}

	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

	public void results() {
		System.out.printf("AREA = %.2f\n", area());
		System.out.printf("PERIMETER = %.2f\n", perimeter());
		System.out.printf("DIAGONAL = %.2f\n", diagonal());
	}

}