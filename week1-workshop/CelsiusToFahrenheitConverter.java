import java.util.Scanner;

public class CelsiusToFahrenheitConverter {
    public static void main(String[] args) {
        // Input temperature in Celsius from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius:");

        // Handling user input as a double data type
        double celsius = scanner.nextDouble();

        // Perform the conversion to Fahrenheit
        double fahrenheit = celsius * 9 / 5 + 32;

        // Output the result
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);

        // Close the scanner
        scanner.close();
    }
}
