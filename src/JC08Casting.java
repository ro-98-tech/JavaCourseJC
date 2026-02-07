/**
 * Demonstrates basic type conversions (casting) and parsing in Java.
 * Includes conversions between String, int, and double.
 */
public class JC08Casting {

    public static void main(String[] args) {
        // Program entry point.

        // Text to integer (parsing)
        String numberText = "123";
        int numberInt = Integer.parseInt(numberText);
        System.out.println("Text -> int: " + numberText + " -> " + numberInt);

        // Integer to text
        int intValue = 456;
        String intText = String.valueOf(intValue);
        System.out.println("int -> text: " + intValue + " -> \"" + intText + "\"");

        // Double to integer (explicit cast: decimals are truncated)
        double doubleValue = 23.34;
        int doubleAsInt = (int) doubleValue;
        System.out.println("double -> int (truncates): " + doubleValue + " -> " + doubleAsInt);

        // Integer to double (widening conversion)
        int intValue2 = 322;
        double intAsDouble = (double) intValue2; // explicit cast optional here
        System.out.println("int -> double: " + intValue2 + " -> " + intAsDouble);
    }
}