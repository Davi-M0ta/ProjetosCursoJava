package entities;

public class Employee {

	public String name;
	public double GrossSalary;
	public double tax;

	public double netSalary() {
		return GrossSalary - tax;
	}

	public void increaseSalary(double percentage) {
		this.GrossSalary += this.GrossSalary * (percentage / 100);
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
}
