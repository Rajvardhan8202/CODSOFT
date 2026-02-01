package com.raj.codsoft.currency;

import com.raj.codsoft.currency.service.CurrencyConverter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("===== Currency Converter =====");
        System.out.print("Enter base currency (USD, EUR, INR): ");
        String baseCurrency = scanner.next().toUpperCase();

        System.out.print("Enter target currency (USD, EUR, INR): ");
        String targetCurrency = scanner.next().toUpperCase();

        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        try {
            double convertedAmount =
                    converter.convertCurrency(baseCurrency, targetCurrency, amount);

            System.out.printf(
                    "Converted Amount: %.2f %s%n",
                    convertedAmount,
                    targetCurrency
            );

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
