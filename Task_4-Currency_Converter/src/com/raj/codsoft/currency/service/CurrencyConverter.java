package com.raj.codsoft.currency.service;

import com.raj.codsoft.currency.model.CurrencyRate;

public class CurrencyConverter {

    public double convertCurrency(String baseCurrency, String targetCurrency, double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }

        double rate = CurrencyRate.getExchangeRate(baseCurrency, targetCurrency);
        return amount * rate;
    }
}
