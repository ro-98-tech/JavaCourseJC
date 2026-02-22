import java.util.Scanner;

public class JC21WhileLoop {

    public static void main(String[] args) {

        // Example 1: Basic while loop counting from 0 to 5
        int i = 0;
        System.out.println("Counting from 0 to 5:");
        while(i<=5){
            System.out.println("The value of i is: " + i);
            if (i == 3) {
                System.out.println("i is equal to 3");
            }
            i++;
        }
        System.out.println("------------------------------");
        // Example 2: Multiples of X number

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find its multiples: ");
        int x = input.nextInt();
        
        input.nextLine();

        System.out.println("The multiples of " + x + " are: ");

        
        int y = 1;
        while (y<=10) {
            System.out.println(x+"x"+y+"="+(x*y));
            y++;
        }

        System.out.println("------------------------------");
        
        // Example 3: Login user control

        final String userName = "admin";
        final String password = "abc123";
        boolean isAuthenticated = false;

        while (!isAuthenticated) {
            System.out.println("Enter username: ");
            String user = input.nextLine();
            System.out.println("Enter password: ");
            String passwordTry = input.nextLine();

            if(userName.equals(user) && password.equals(passwordTry)){
                System.out.println("Login successful!");
                isAuthenticated = true;
            } else {
                System.out.println("Invalid username or password."+"\n"+" Please try again.");
            }
        }
        // Close the scanner to prevent resource leaks4
        input.close();
    }
}
