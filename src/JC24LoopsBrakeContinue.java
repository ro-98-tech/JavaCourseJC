public class JC24LoopsBrakeContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("Current value of i: " + i);
            if (i == 5) {
                System.out.println("i has reached 5, breaking the loop.");
                break; // This will exit the loop when i is 5
            }
            System.out.println("Current value of i: " + i);
            i++;
        }
        System.out.println("Loop has ended.");

        // Now let's see how continue works
        for (int j = 0; j < 10; j++) {
            if (j % 2 == 0) {
                continue; // This will skip the rest of the loop body for even numbers
            }
            System.out.println("Current odd value of j: " + j);
        }
    }

}
