package entities;

public class CurrencyConverter {

	public static double iof=1.06;
	
	public static double calc (double amount, double price) {
		double cost = price*amount;
		return cost * iof;
	}

}
