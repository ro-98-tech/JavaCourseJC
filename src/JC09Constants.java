/**
 * Demonstrates the use of constants in Java using the 'final' keyword.
 * A constant cannot be reassigned once it has been initialized.
 */
public class JC09Constants {

    public static void main(String[] args) {
        // Program entry point.

        // Basic constant (cannot be modified)
        final int value = 50;
        System.out.println("Value: " + value);

        // value = 61; // ❌ Error: cannot reassign a final variable

        // Constants are often used for fixed scientific or mathematical values
        final double gravity = 9.81;     // Earth's gravity (m/s²)
        final double pi = 3.14159;       // Mathematical constant π

        // Optional: print them to verify
        System.out.println("Gravity: " + gravity);
        System.out.println("PI: " + pi);
    }
}