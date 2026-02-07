/**
 * Demonstrates different types of comments in Java.
 * Shows single-line comments, multi-line comments,
 * and how to disable code using comments.
 */
public class JC05Comments {

    public static void main(String[] args) {
        // Program entry point.

        // Variable declaration
        String channel, course, purpose;

        // Assigning values
        channel = "Inform";
        course = "Java";
        purpose = "Learn";

        // Disabled print statement (example of commenting out code)
        // System.out.println("Channel name: " + channel);

        // Active print statement
        System.out.println("Course name: " + course);

        /*
         * Another disabled print using multi-line comment
         * System.out.println("Purpose: " + purpose);
         */
    }
}