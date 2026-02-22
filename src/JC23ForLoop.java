public class JC23ForLoop {
    public static void main(String[] args) {
        // The for loop is a control flow statement that allows code to be executed repeatedly based on a given boolean condition.
        // It consists of three parts: initialization, condition, and update.
        int condition = 10; // This is evaluated before each iteration. If it evaluates to
        int update = 1; // This is executed after each iteration of the loop.
        // Loop ascending from 0 to 10
        for( int initialization = 0; initialization <= condition; initialization += update ) {
            System.out.println("Counter = " + initialization);
        }
        System.out.println("Loop has ended.");

        System.out.println("-----------------------------");

        // Loop descending from 10 to 0
        for( int initialization = 10; initialization >= 0; initialization -= update ) {
            System.out.println("Counter = " + initialization);
        }
        System.out.println("Loop has ended.");

        System.out.println("-----------------------------");

        // Loop to sum the first 10 natural numbers and find the pair numbers 
        int sum = 0;
        for( int i = 1; i <= 10; i++ ) {
            sum += i; // This is equivalent to sum = sum + i;
            if (i % 2 == 0) {
                System.out.println(i + " is a pair number.");
            } else {
                System.out.println(i + " is an odd number.");
            }
        }
        System.out.println("Sum of first 10 natural numbers = " + sum);
    }
}
