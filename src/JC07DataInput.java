import javax.swing.JOptionPane;

/**
 * Reads user input using Swing dialogs (JOptionPane).
 * Asks for name and age, then shows the result.
 */
public class JC07DataInput {

    public static void main(String[] args) {
        // Program entry point.

        // Input
        String name = JOptionPane.showInputDialog(null, "Enter your name..."); // Show an input dialog and store the user's input in the 'name' variable.
        String ageText = JOptionPane.showInputDialog(null, "Enter your age...");// Show an input dialog, get the user's input as a string, and convert it to an integer using Integer.parseInt().
        // Display the user's name and age in a message dialog.

        int age = Integer.parseInt(ageText); // assumes valid integer

        // Output
        String message = "Name: " + name + "\nAge: " + age;
        // Show a message dialog with the user's name and age.
        JOptionPane.showMessageDialog(null, message);
    }
}