import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        // Input side lengths from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of side 'a':");
        double a = scanner.nextDouble();
        System.out.println("Enter the length of side 'b':");
        double b = scanner.nextDouble();
        System.out.println("Enter the length of side 'c':");
        double c = scanner.nextDouble();

        // Calculate the semi-perimeter
        double s = (a + b + c) / 2;

        // Calculate the area using Heron's formula
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Output the result
        System.out.println("The area of the triangle is: " + area);

        // Close the scanner
        scanner.close();
    }
}
