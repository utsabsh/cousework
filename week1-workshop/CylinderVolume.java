import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        // Input radius and height from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder:");
        double radius = scanner.nextDouble();

        System.out.println("Enter the height of the cylinder:");
        double height = scanner.nextDouble();

        // Calculate the volume of the cylinder
        double volume = Math.PI * Math.pow(radius, 2) * height;

        // Output the result
        System.out.println("The volume of the cylinder is: " + volume);

        // Close the scanner
        scanner.close();
    }
}
