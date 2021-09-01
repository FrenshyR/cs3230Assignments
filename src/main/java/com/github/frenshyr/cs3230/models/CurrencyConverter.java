package com.github.frenshyr.cs3230.models;
import static com.github.frenshyr.cs3230.gui.Utilities.change;

public class CurrencyConverter {
    String conversion_rate = "";

    public String getRate() {
        return conversion_rate;
    }
    public static String convertedRate(String rate, double amount) {
        double convertedRate =  amount * Double.parseDouble(rate);
        return String.valueOf(change(convertedRate, 2));
    }
}
