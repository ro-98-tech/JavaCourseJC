import java.util.Scanner;
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

        // Data input (from standard input)
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