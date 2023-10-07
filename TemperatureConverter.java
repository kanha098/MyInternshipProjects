
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature;
        String unit;

        System.out.println("Temperature Converter");
        System.out.print("Enter a temperature value: ");

        while (true) {
            try {
                temperature = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Enter a valid temperature value: ");
            }
        }

        System.out.print("Enter the unit (Celsius or Fahrenheit): ");
        while (true) {
            unit = scanner.nextLine().trim().toLowerCase();
            if (unit.equals("celsius") || unit.equals("fahrenheit")) {
                break;
            } else {
                System.out.print("Invalid unit. Enter 'Celsius' or 'Fahrenheit': ");
            }
        }

        double convertedTemperature;
        if (unit.equals("celsius")) {
            convertedTemperature = celsiusToFahrenheit(temperature);
            System.out.println(temperature + " Celsius is equal to " + convertedTemperature + " Fahrenheit.");
        } else {
            convertedTemperature = fahrenheitToCelsius(temperature);
            System.out.println(temperature + " Fahrenheit is equal to " + convertedTemperature + " Celsius.");
        }

        scanner.close();
    }
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}