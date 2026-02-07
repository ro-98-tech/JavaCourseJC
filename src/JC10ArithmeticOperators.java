import java.util.Scanner;

/**
 * Performs basic arithmetic operations (+, -, *, /, %) on two integers.
 * Reads input from the console and prints the results.
 * Later topics will include handling decimal division and division by zero.
 */
public class JC10ArithmeticOperators {

    public static void main(String[] args) {
        // Program entry point.

        int value1, value2, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter value 1...");
        value1 = input.nextInt();

        System.out.println("Enter value 2...");
        value2 = input.nextInt();

        // Addition
        result = value1 + value2;
        System.out.println("Sum: " + result);

        // Subtraction
        result = value1 - value2;
        System.out.println("Difference: " + result);

        // Multiplication
        result = value1 * value2;
        System.out.println("Product: " + result);

        // Division (integer division)
        result = value1 / value2;
        System.out.println("Quotient (int division): " + result);

        // Remainder (modulo)
        result = value1 % value2;
        System.out.println("Remainder: " + result);

        input.close(); // OK here because the program ends after this
    }
}