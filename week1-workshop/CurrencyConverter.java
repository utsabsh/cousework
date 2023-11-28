import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Input amount in U.S. dollars and exchange rate from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount in U.S. dollars:");
        double amountInUSD = scanner.nextDouble();

        System.out.println("Enter the exchange rate:");
        double exchangeRate = scanner.nextDouble();

        // Calculate the converted amount
        double convertedAmount = amountInUSD * exchangeRate;

        // Output the result
        System.out.println("The converted amount is: " + convertedAmount);

        // Close the scanner
        scanner.close();
    }
}
