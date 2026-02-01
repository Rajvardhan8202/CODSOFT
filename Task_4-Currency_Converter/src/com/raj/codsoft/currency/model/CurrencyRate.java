package com.raj.codsoft.currency.model;

import java.util.HashMap;
import java.util.Map;

public class CurrencyRate {

    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static {
        exchangeRates.put("USD_INR", 91.69);
        exchangeRates.put("INR_USD", 0.0109);
        exchangeRates.put("EUR_INR", 108.66);
        exchangeRates.put("INR_EUR", 0.0092);
        exchangeRates.put("USD_EUR", 0.92);
        exchangeRates.put("EUR_USD", 1.18);
    }

    public static double getExchangeRate(String base, String target) {
        String key = base + "_" + target;
        if (!exchangeRates.containsKey(key)) {
            throw new IllegalArgumentException("Exchange rate not available.");
        }
        return exchangeRates.get(key);
    }
}
