import java.util.Scanner;

public class JC22DoWhileLoop {
    public static void main(String[] args) {
        int counter = 1;
        final int MAX = 10;
        // The do-while loop will execute the block of code at least once, even if the condition is false.
        do {
            System.out.println("Counter = " + counter);
            counter++;
        } while (counter <= MAX);
        System.out.println("Loop has ended.");

        // Example of using do-while loop to validate user input
        Scanner scanner = new Scanner(System.in);
        int number;
        int errorCount = 0;
        do{
            System.out.println("Enter one number between 1 and 10: ");
            number = scanner.nextInt();
            if (number != 5) {
                System.out.println("You entered " + number + ". Try again.");
                errorCount++;
            }
        } while (number != 5);
        System.out.println("You entered 5. Loop has ended.");
        System.out.println("Number of errors: " + errorCount);
        scanner.close();   
    }
}

