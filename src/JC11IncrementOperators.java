/**
 * Demonstrates increment, decrement, and compound assignment operators.
 * Prints a formatted table showing the operation and the resulting value.
 */
public class JC11IncrementOperators {

    public static void main(String[] args) {
        // Program entry point.

        int value = 5;

        // Original value
        System.out.printf("   %-15s : %d%n", "Original", value);

        // Postfix increment
        value++;
        System.out.printf("   %-15s : %d%n", "Postfix ++", value);

        // Prefix increment
        ++value;
        System.out.printf("   %-15s : %d%n", "Prefix ++", value);

        // Increase by 2
        value += 2;
        System.out.printf("   %-15s : %d%n", "Add 2", value);

        // Postfix decrement
        value--;
        System.out.printf("   %-15s : %d%n", "Postfix --", value);

        // Prefix decrement
        --value;
        System.out.printf("   %-15s : %d%n", "Prefix --", value);

        // Decrease by 2
        value -= 2;
        System.out.printf("   %-15s : %d%n", "Subtract 2", value);

        // Multiplication by 2
        value *= 2;
        System.out.printf("   %-15s : %d%n", "Multiplication", value);

        // Division by 2
        value /= 2;
        System.out.printf("   %-15s : %d%n", "Division", value);
    }
}