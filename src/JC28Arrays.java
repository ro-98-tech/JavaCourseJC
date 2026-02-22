public class JC28Arrays {
    public static void main(String[] args) {
        //Declare and initialize an array of integers
        int[] numbers;
        numbers = new int[5]; //Array of size 5
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        //Another way to declare and initialize an array
        int[] moreNumbers = {5, 15, 25, 35, 45};

        //Length of the array
        System.out.println("Length of numbers array: " + moreNumbers.length);

        //Accessing elements of the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);
        System.out.println("Fifth element: " + numbers[4]);
        System.out.println("");

        //Using the value to initialize another variable
        int firstNumber = numbers[0];
        int secondNumber = numbers[1];
        int thirdNumber = numbers[2];
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);   
        System.out.println("Third number: " + thirdNumber);
        System.out.println("");
        
        //Iterating through the array using a for loop
        System.out.println("Iterating through the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        System.out.println("");

        //Iterating through the array using a for-each loop
        System.out.println("Iterating through the array using for-each loop:");
        for (int number : numbers) {
            System.out.println("Element: " + number);
        }

        //Arrays of different data types
        String[] names = {"Alice", "Bob", "Charlie"};
        double[] decimals = {1.5, 2.5, 3.5};
        boolean[] flags = {true, false, true};
        System.out.println("");
        System.out.println("Names:");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("");
        System.out.println("Decimals:");
        for (double decimal : decimals) {
            System.out.println(decimal);
        }
        System.out.println("");
        System.out.println("Flags:");
        for (boolean flag : flags) {
            System.out.println(flag);
        }


    }
}
