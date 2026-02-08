import java.util.Scanner;

/**
 * Reads a boolean flag from the console to monitor system status.
 * Demonstrates using the NOT operator (!) in an if-statement:
 * - If the system is NOT online -> prints "System out of line"
 * - Otherwise -> prints "System online"
 *
 * Input is read from standard input (console) using Scanner.
 */
public class JC16IfNotConditional {

    public static void main(String[] args) {
        // Program entry point.

        // Input variables
        boolean isOnline;

        // Data input (from standard input)
        Scanner input = new Scanner(System.in);

        System.out.println("System monitor");
        System.out.print("Is the system online? (true/false): ");

        // Read a boolean safely
        if (input.hasNextBoolean()) {
            isOnline = input.nextBoolean();
        } else {
            // Fallback when the user doesn't enter a boolean value
            System.out.println("Invalid input. Assuming: false (system is offline).");
            isOnline = false;
            // Clear the invalid token from the buffer
            input.nextLine();
        }

        // Decision using NOT operator
        if (!isOnline) {
            System.out.println("System out of line");
        } else {
            System.out.println("System online");
        }

        // (Optional) Data output section, mirroring the JC06 style
        System.out.println("isOnline: " + isOnline);

        input.close();
    }
}