import javax.swing.JOptionPane;

/**
 * Reads user input using Swing dialogs (JOptionPane).
 * Asks for name and age, then shows the result.
 */
public class JC07DataInput {

    public static void main(String[] args) {
        // Program entry point.

        // Input
        String name = JOptionPane.showInputDialog(null, "Enter your name...");
        String ageText = JOptionPane.showInputDialog(null, "Enter your age...");

        int age = Integer.parseInt(ageText); // assumes valid integer

        // Output
        String message = "Name: " + name + "\nAge: " + age;
        JOptionPane.showMessageDialog(null, message);
    }
}