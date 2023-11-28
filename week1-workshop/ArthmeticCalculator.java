import java.util.Scanner;

public class ArthmeticCalculator {
    public static void main(String[] args) {
        // Input two integers from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second integer:");
        int num2 = scanner.nextInt();

        // Perform arithmetic operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;

        // Check for division by zero before performing division
        if (num2 != 0) {
            double quotient = (double) num1 / num2;
            System.out.println("Quotient (Division): " + quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        // Output the results
        System.out.println("Sum (Addition): " + sum);
        System.out.println("Difference (Subtraction): " + difference);
        System.out.println("Product (Multiplication): " + product);

        // Close the scanner
        scanner.close();
    }
}
