import java.util.Scanner;

public class JC20MethodNextLine {
    public static void main(String[] args) {
        String text1, text2;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter text 1: ");
        text1 = input.nextLine();
        System.out.println("Enter text 2: ");
        text2 = input.nextLine();

        System.out.println("Text 1: " + text1);
        System.out.println("Text 2: " + text2);

        // Closing the scanner to prevent resource leaks
        input.close();
    }
}
