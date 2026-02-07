/**
 * Demonstrates logical operators in Java: AND (&&), OR (||), NOT (!), XOR (^).
 * Prints each logical expression and its boolean result in a formatted table.
 */
public class JC13LogicOperators {

    public static void main(String[] args) {
        // Program entry point.

        boolean a = true;
        boolean b = false;

        System.out.println();
        System.out.printf("Values -> a: %b, b: %b%n", a, b);
        System.out.println();

        // AND (both must be true)
        System.out.printf("   %-10s : %b%n", "a && b", (a && b));

        // OR (at least one true)
        System.out.printf("   %-10s : %b%n", "a || b", (a || b));

        // NOT (negation)
        System.out.printf("   %-10s : %b%n", "  !a", (!a));

        // XOR (exclusive OR: true if exactly one is true)
        System.out.printf("   %-10s : %b%n", "a ^ b", (a ^ b));
    }
}
