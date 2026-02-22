import javax.swing.JOptionPane;

public class JC26LoopsExamples {
    public static void main(String[] args) {
        boolean validation = false;

        while (!validation) {
            String input = JOptionPane.showInputDialog("Enter your email address:");

            // if the user cancels the input dialog, input will be null
            if (input == null) {
                JOptionPane.showMessageDialog(null, "You must enter an email address.");
                continue;
            }

            input = input.trim();

            // if the user enters an empty string, prompt them again
            if (input.isEmpty()) {
                JOptionPane.showMessageDialog(null, "You must enter an email address.");
                continue;
            }

            // if the input contains "@" and ends with ".com", consider it valid
            else if (input.contains("@") && input.endsWith(".com")) {
                JOptionPane.showMessageDialog(null, "Email address is valid");
                validation = true;
            } else {
                JOptionPane.showMessageDialog(null, "Email address is invalid. Please try again.");
            }
        }
    }
}
