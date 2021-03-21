package com.djablo;

public class main2 {
    public static void main(String... args) {
        // this is not the best type to store temperature, stay tuned for better one ;)
        int positiveTemperature = 10;
        int negativeTemperature = -10;

        isTemperaturePositive(positiveTemperature);
        isTemperaturePositive(negativeTemperature);
    }

    private static void isTemperaturePositive(int temperature) {
      //  boolean isPositive = temperature > 0;

        if (temperature > 0) {
            System.out.println("Temperatura " + temperature + " jest dodatnia.");
        }
        else {
            System.out.println("Temperatura " + temperature + " nie jest dodatnia.");
        }

        return;
    }
}