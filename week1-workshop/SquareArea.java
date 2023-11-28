import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        // Input side length from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of one side of the square:");

        // Handling user input as a double data type
        double sideLength = scanner.nextDouble();

        // Calculate the area of the square
        double area = sideLength * sideLength;

        // Output the result
        System.out.println("The area of the square is: " + area);

        // Close the scanner
        scanner.close();
    }
}
