import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner myobj= new Scanner(System.in);
        System.out.println("enter your name:");
        String name= myobj.nextLine();
        System.out.print("hello "+name);
    }
}