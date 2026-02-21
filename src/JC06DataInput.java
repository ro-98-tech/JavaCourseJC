import java.util.Scanner;// Import the Scanner class from the java.util package to read input from the user.

/**
 * Reads basic user input from the console using Scanner.
 * Demonstrates reading a String and an int, then printing them.
 */
public class JC06DataInput {

    public static void main(String[] args) {
        // Program entry point.

        // Input variables
        String name;
        int age;

        // Create a Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);

        System.out.println("Type your full name...");
        name = input.nextLine(); // reads the full line (supports spaces)

        System.out.println("Type your age...");
        age = input.nextInt();

        // Data output
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        // Closing the scanner to prevent resource leaks
        input.close();
    }
}