import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        // Input principal amount, rate of interest, and time period from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        double principal = scanner.nextDouble();

        System.out.println("Enter the rate of interest:");
        double rate = scanner.nextDouble();

        System.out.println("Enter the time period (in years):");
        double time = scanner.nextDouble();

        // Calculate the simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Output the result
        System.out.println("The simple interest is: " + simpleInterest);

        // Close the scanner
        scanner.close();
    }
}