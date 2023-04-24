package util;

public class CurrencyConverter {
	public static double convertMoney(double price, double money) {
		return (money * price) + (money * price) * 0.06;
	}
}
