
/**
 * Shows basic variable types in Java.
 * Demonstrates how to store and print different kinds of values.
 */
public class JC02Variables {

    public static void main(String[] args) {
        // Program entry point.

        // Declaring and initializing variables of different data types

        // String variable (text)
        String name = "Ro";
        // String variable (text)
        String greeting = "Hello Ro";
        // Integer variable (whole numbers)
        int age = 25;
        // Double variable (decimal numbers)
        double height = 1.75;
        // Boolean variable (true/false)
        boolean isStudent = true;
        // Char variables (single character)
        char gender = 'M';
        char character = '9';
        char symbol = '@';


        // Printing the values of the variables to the console
        System.out.println("Hi, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("The greeting message is: " + greeting);
        System.out.println("Your height is " + height + " meters.");
        System.out.println("Your gender is " + gender);
        System.out.println("Your character is " + character);
        System.out.println("Your symbol is " + symbol);
        System.out.println("Are you a student? " + isStudent);
    }
}