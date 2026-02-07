/**
 * Demonstrates comparison (relational) operators in Java.
 * Prints each comparison and its boolean result.
 */
public class JC12ComparisonOperators {

    public static void main(String[] args) {
        // Program entry point.

        int value1 = 90;
        int value2 = 50;

        System.out.println();
        System.out.printf("Values -> value1: %d, value2: %d%n", value1, value2);

        System.out.println("--------------------------------");

        // Each line shows the expression and its boolean result
        System.out.printf("   %-15s : %b%n", "value1 == value2", (value1 == value2));
        System.out.printf("   %-15s : %b%n", "value1 != value2", (value1 != value2));
        System.out.printf("   %-15s : %b%n", "value1 > value2",  (value1 > value2));
        System.out.printf("   %-15s : %b%n", "value1 < value2",  (value1 < value2));
        System.out.printf("   %-15s : %b%n", "value1 >= value2", (value1 >= value2));
        System.out.printf("   %-15s : %b%n", "value1 <= value2", (value1 <= value2));
    }
}