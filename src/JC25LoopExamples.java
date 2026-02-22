import javax.swing.JOptionPane;

public class JC25LoopExamples {
    public static void main(String[] args) {
        // Example of a for loop
        System.out.println("For loop example:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Current value of i: " + i);
        }

        // Example of a while loop
        System.out.println("\nWhile loop example:");
        int j = 0;
        while (j < 5) {
            System.out.println("Current value of j: " + j);
            j++;
        }

        // Example of a do-while loop
        System.out.println("\nDo-while loop example:");
        int k = 0;
        do {
            System.out.println("Current value of k: " + k);
            k++;
        } while (k < 5);

        // Login example using a while loop
        System.out.println("\nLogin example:");
        final String USERNAME = "admin";
        final String PASSWORD = "password123";
        String inputUsername, inputPassword; // Simulating user input
        boolean loginSuccessful = false;
        int attempts = 1;
        int maxAttempts = 3;

        while (!loginSuccessful && attempts < maxAttempts) {
            inputUsername=JOptionPane.showInputDialog("Enter username:"); // Simulating user input
            inputPassword=JOptionPane.showInputDialog("Enter password:"); // Simulating user

            if (inputUsername.equals(USERNAME) && inputPassword.equals(PASSWORD)) {
                JOptionPane.showMessageDialog(null, "Login successful! Welcome, " + USERNAME + "!");
                loginSuccessful = true;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password.");
                attempts++;
            }
        }

        if (!loginSuccessful) {
            JOptionPane.showMessageDialog(null, "Too many failed attempts. Login blocked.");
        }
    }

}
