import javax.swing.JOptionPane;

/**
 * Implementation detail (the IF statement):
 * Access control using simple boolean logic with OR (||).
 * - We use the logical OR (||) operator:
 * if (isSunday || onVacation || !hasLicense) -> deny access
 * - Otherwise -> access confirmed.
 */
public class JC15IfOrCondition {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog(null, "Enter your name:");

        // User types "true" or "false"
        boolean isSunday = Boolean.parseBoolean(
                JOptionPane.showInputDialog(null, name + ", is today Sunday? (true/false)"));

        boolean onVacation = Boolean.parseBoolean(
                JOptionPane.showInputDialog(null, name + ", are you on vacation? (true/false)"));

        boolean hasLicense = Boolean.parseBoolean(
                JOptionPane.showInputDialog(null, name + ", do you have a valid license? (true/false)"));

        // IF statement using OR (||): deny access if ANY blocking condition is true
        if (isSunday || onVacation || !hasLicense) {
            JOptionPane.showMessageDialog(null, name + ", access denied to the factory.");
        } else {
            JOptionPane.showMessageDialog(null, name + ", access confirmed.");
        }
    }
}