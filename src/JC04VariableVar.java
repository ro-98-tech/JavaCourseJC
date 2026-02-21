/**
 * Demonstrates local variable type inference with 'var'.
 * Shows where it works, typical pitfalls, and best practices.
 * Notes:
 * - 'var' can only be used for local variables with an initializer.
 * - The inferred type is fixed at compile time (it is NOT dynamic).
 */
public class JC04VariableVar {

    public static void main(String[] args) {
        // Program entry point.

        // --- Basic inference from literals ---
        var name = "N1";     // inferred as String
        var number = 20;     // inferred as int
        var amount = 10.50;  // inferred as double

        System.out.println("Name: " + name);
        System.out.println("Number (int): " + number);
        System.out.println("Amount (double): " + amount);

        // We can use 'var' to declare variables without explicitly specifying their type. The compiler infers the type based on the assigned value.
        // However, 'var' cannot be used for class fields, method parameters, or return types. It is only allowed for local variables within methods.

        // --- Inference details (important) ---
        var big = 10L;       // long (because of the L suffix)
        var precise = 10.5f; // float (because of the f suffix)
        var letter = 'R';    // char
        var truth = true;    // boolean

        System.out.println("Types inferred -> long, float, char, boolean: "
                + big + ", " + precise + ", " + letter + ", " + truth);
    }
}