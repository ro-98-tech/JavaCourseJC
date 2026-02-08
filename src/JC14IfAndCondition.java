import javax.swing.JOptionPane;

/**
 * Classifies a person by age using simple if/else conditions.
 * Categories: Adult (>= 18), Teenager (13–17), Child (1–12), Invalid otherwise.
 */
public class JC14IfAndCondition {

    public static void main(String[] args) {
        // Program entry point.

        String name = JOptionPane.showInputDialog(null, "Type your name...");
        String ageText = JOptionPane.showInputDialog(null, "Type your age...");

        int age = Integer.parseInt(ageText); // assumes a valid integer

        // IF block: checks age ranges in order -> adult (>=18), teenager (13–17), child (1–12), else invalid
        if (age >= 18) {
            JOptionPane.showMessageDialog(null, "You are an adult");
        } else if (age >= 13 && age <= 17) {
            JOptionPane.showMessageDialog(null, "You are a teenager");
        } else if (age >= 1 && age <= 12) {
            JOptionPane.showMessageDialog(null, "You are a child");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid age");
        }
    }
}
