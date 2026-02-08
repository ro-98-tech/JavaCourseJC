import java.util.Scanner;

public class JC21WhileLoop {

    public static void main(String[] args) {
        int i = 0;

        // While loop
        while(i<=5){
            System.out.println("The value of i is: " + i);
            if (i == 3) {
                System.out.println("i is equal to 3");
            }
            i++;
        }
        System.out.println("------------------------------");
        // Example 2: Multiples of X number

        int x;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find its multiples: ");
        x= input.nextInt();

        System.out.println("The multiples of " + x + " are: ");
        
        int y = 1;
        while (y<=10) {
            System.out.println(x+"x"+y+"="+(x*y));
            y++;
        }

        // Example 3: Login user control

        final String userName = "admin";
        final String password = "abc123";
        boolean isAuthenticated = false;

        while (!isAuthenticated) {
            System.out.println("Enter username: ");
            String user = input.next();
            System.out.println("Enter password: ");
            String passwordTry = input.nextLine();

            if(userName.equals(user) && password.equals(passwordTry)){
                System.out.println("Login successful!");
                isAuthenticated = true;
            } else {
                System.out.println("Invalid username or password."+"\n"+" Please try again.");
            }
        }



        input.close();
    }
}
