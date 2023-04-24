package entities;

public class Student {

	public String name;
	public double gradeOne, gradeTwo, gradeThree;

	public double calcFinalGrade() {
		return (gradeOne + gradeTwo + gradeThree);
	}

	public void checkStatus() {
		System.out.println("");
		System.out.printf("FINAL GRADE = %.2f\n", calcFinalGrade());

		if (calcFinalGrade() > 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			double missingPoints = 60 - calcFinalGrade();
			System.out.printf("MISSING %.2f POINTS", missingPoints);
		}

	}
}
