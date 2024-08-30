import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureConversor {
    static Scanner scanner = new Scanner(System.in);

    // Method to convert Celsius to Fahrenheit
    public static float celsiusToFahrenheit(float celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static float fahrenheitToCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Main method
    public static void main(String[] args) {
        float temperatura = 0;
        boolean validInput = false;

        // Getting temperature input
        while (!validInput) {
            try {
                System.out.println("-----------");
                System.out.println("Ingrese la temperatura:");
                temperatura = scanner.nextFloat();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Temperatura no válida. Ingrese una temperatura numérica.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Getting unit of measurement input
        System.out.println("Ingrese la unidad de medida (C/F):");
        String unit_measurement = scanner.next().toUpperCase();

        float convertedTemperature = 0;
        switch (unit_measurement) {
            case "C":
                convertedTemperature = celsiusToFahrenheit(temperatura);
                System.out.println(temperatura + " °C es igual a " + convertedTemperature + " °F.");
                break;
            case "F":
                convertedTemperature = fahrenheitToCelsius(temperatura);
                System.out.println(temperatura + " °F es igual a " + convertedTemperature + " °C.");
                break;
            default:
                System.out.println("Unidad de medida no válida. Use 'C' para Celsius o 'F' para Fahrenheit.");
                break;
        }

        scanner.close();
    }

}
