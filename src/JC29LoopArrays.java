public class JC29LoopArrays {
    public static void main(String[] args) {
        String[] products = {"Laptop", "Smartphone", "Tablet", "Headphones", "Smartwatch"};
        
        // Loop through the products array using a for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }


        int[] numbers = {1, 2, 3, 4, 5};

        // Loop through the array using a for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Loop through the array using an enhanced for loop (for-each)
        System.out.println("\nUsing enhanced for loop:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
