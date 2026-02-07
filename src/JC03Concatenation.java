/**
 * Demonstrates different string concatenation techniques in Java.
 * Uses + operator, String.concat, and formatted output (printf/format).
 * Prints clear, traceable steps to show exactly what is being combined.
 */
public class JC03Concatenation {

    public static void main(String[] args) {
        // Program entry point.

        // Basic String variables
        String name = "Homero";
        String lastName = "Simpson";

        // Integer variable (used to show mixing text + numbers)
        int value = 100;

        // Two words that will be combined
        String word1 = "Learning";
        String word2 = "Java";

        // Concatenating with + operator
        String fullNamePlus = name + " " + lastName;
        String greetingPlus = word1 + " " + word2;

        // Concatenating with String.concat
        String greetingConcat = word1.concat(" ").concat(word2);

        // ---- Output section (clear, step-by-step) ----

        // Basic values
        System.out.println("Showing base values:");
        System.out.println("  name = " + name);
        System.out.println("  lastName = " + lastName);
        System.out.println("  value = " + value);
        System.out.println("  word1 = " + word1);
        System.out.println("  word2 = " + word2);
        System.out.println();

        // 1) Using + operator
        System.out.println("1) Using + operator:");
        System.out.println("   Concatenating name + \" \" + lastName -> " + fullNamePlus);
        System.out.println("   Concatenating word1 + \" \" + word2   -> " + greetingPlus);
        System.out.println();

        // 2) Using String.concat
        System.out.println("2) Using String.concat:");
        System.out.println("   Concatenating word1.concat(\" \").concat(word2) -> " + greetingConcat);
        System.out.println();

        // 3) Using formatted output (String.format / printf)
        System.out.println("3) Using formatted output:");
        String fullNameFormatted = String.format("%s %s", name, lastName);
        System.out.println("   String.format(\"%s %s\", name, lastName) -> " + fullNameFormatted);

        // printf prints directly to console with format specifiers
        System.out.print("   System.out.printf(\"Full name: %s %s\\n\", name, lastName) -> ");
        System.out.printf("Full name: %s %s%n", name, lastName);

        // Mixing text + numbers with format
        System.out.printf("   System.out.printf(\"Value as integer: %d | as padded: %05d\\n\", value, value) -> Value as integer: %d | as padded: %05d%n",
                value, value, value, value);
        System.out.println();

        // Extra: show why formatting helps readability
        System.out.println("Why formatting helps:");
        System.out.printf("   %-12s : %s%n", "First name", name);
        System.out.printf("   %-12s : %s%n", "Last name", lastName);
        System.out.printf("   %-12s : %s%n", "Greeting", greetingPlus);
    }
}