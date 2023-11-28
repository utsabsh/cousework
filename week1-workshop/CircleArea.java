import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        // Input radius from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();

        // Calculate the area of the circle
        double area = Math.PI * Math.pow(radius, 2);

        // Output the result
        System.out.println("The area of the circle is: " + area);

        // Close the scanner
        scanner.close();
    }
}
