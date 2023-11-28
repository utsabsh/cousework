import java.util.Scanner;

public class MilesToKmConverter {
    public static void main(String[] args) {
        // Input distance in miles from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance in miles:");
        double miles = scanner.nextDouble();

        // Conversion factor: 1 mile = 1.60934 kilometers
        double kilometers = miles * 1.60934;

        // Output the result
        System.out.println("The equivalent distance in kilometers is: " + kilometers);

        // Close the scanner
        scanner.close();
    }
}
