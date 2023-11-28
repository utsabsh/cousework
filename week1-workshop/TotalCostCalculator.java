import java.util.Scanner;

public class TotalCostCalculator {
    public static void main(String[] args) {
        // Input quantity and price from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quantity of items:");
        int quantity = scanner.nextInt();

        System.out.println("Enter the price per item:");
        double pricePerItem = scanner.nextDouble();

        // Calculate the total cost
        double totalCost = quantity * pricePerItem;

        // Output the result
        System.out.println("The total cost is: " + totalCost);

        // Close the scanner
        scanner.close();
    }
}
