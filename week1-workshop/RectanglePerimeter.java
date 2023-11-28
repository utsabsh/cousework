import java.util.Scanner;

public class RectanglePerimeter{
    public static void main(String[] args) {
        // Input length and width from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();

        // Calculate the perimeter of the rectangle
        double perimeter = 2 * (length + width);

        // Output the result
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        // Close the scanner
        scanner.close();
    }
}
