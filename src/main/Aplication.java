package main;

import java.util.Scanner;
import entities.CurrencyConverter;

public class Aplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price=sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amount=sc.nextDouble();
		double calcCurrency=CurrencyConverter.calc(amount, price);
		System.out.print("Amount to be paid in reais = " + calcCurrency);
		
		sc.close();
	}

}
