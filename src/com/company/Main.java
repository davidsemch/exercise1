package com.company;

public class Main {

    public static void main(String[] args) {
        String city = "Columbus";
        int zipcode = 43215;

        int[] forecastHighs = {32, 25, 27, 40, 45};

        double total = 0.0;

        for (int i = 0; i < forecastHighs.length; i++) {
            total += forecastHighs[i];
        }

        double quotient = (total / forecastHighs.length);

        System.out.println(city + " with a zip code of " + zipcode + " will have an average of " + quotient + " degrees");

    }
}
