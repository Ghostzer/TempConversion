package com.example.afpa.tempcomverter;

/**
 * Created by Afpa on 06/02/2017.
 */

public class Convert {
    public static double celsiusToFahrenheit (double c) {
        return 32+c*9/5;
    }

    public static double fahrenheitToCelsius (double f) {
        return (f-32)*5/9;
    }
}
