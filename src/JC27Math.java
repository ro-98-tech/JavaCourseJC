import java.util.Scanner;

public class JC27Math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Calculate the square root of a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        double sqrt = Math.sqrt(number);
        System.out.println("The square root of " + number + " is: " + sqrt);
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("");

        //Calculate the power of a number
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        double power = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + power);
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("");

        //Calculate the absolute value of a number
        System.out.print("Enter a number: ");
        double absNumber = scanner.nextDouble();
        double absValue = Math.abs(absNumber);
        System.out.println("The absolute value of " + absNumber + " is: " + absValue);
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("");

        //Calculate the maximum of two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double max = Math.max(num1, num2);
        System.out.println("The maximum of " + num1 + " and " + num2 + " is: " + max);
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("");

        //Calculate the minimum of two numbers
        System.out.print("Enter the first number: ");
        double num3 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num4 = scanner.nextDouble();
        double min = Math.min(num3, num4);
        System.out.println("The minimum of " + num3 + " and " + num4 + " is: " + min);
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("");

        //Calculate roundedl, floor and ceiling of a number
        System.out.print("Enter a number: ");
        double num5 = scanner.nextDouble();
        double rounded = Math.round(num5);
        double floor = Math.floor(num5);
        double ceiling = Math.ceil(num5);
        System.out.println("The rounded value of " + num5 + " is: " + rounded);
        System.out.println("The floor of " + num5 + " is: " + floor);
        System.out.println("The ceiling of " + num5 + " is: " + ceiling);
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("");

        //Random number generation
        double random = Math.random();
        System.out.println("A random number between 0 and 1: " + random);
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("");

        //Generate the pi value
        double pi = Math.PI;
        System.out.println("The value of pi is: " + pi);
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("");

        //Trigonometric functions
        System.out.print("Enter an angle in degrees: ");
        double angleDegrees = scanner.nextDouble();
        double angleRadians = Math.toRadians(angleDegrees);
        double sinValue = Math.sin(angleRadians);
        double cosValue = Math.cos(angleRadians);
        double tanValue = Math.tan(angleRadians);
        System.out.println("The sine of " + angleDegrees + " degrees is: " + sinValue);
        System.out.println("The cosine of " + angleDegrees + " degrees is: " + cosValue);
        System.out.println("The tangent of " + angleDegrees + " degrees is: " + tanValue);
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("");

        //Logarithmic functions
        System.out.print("Enter a number for logarithm: ");
        double logNumber = scanner.nextDouble();
        double logValue = Math.log(logNumber);
        System.out.println("The natural logarithm of " + logNumber + " is: " + logValue);
        System.out.print("Enter a number for base 10 logarithm: ");
        double log10Number = scanner.nextDouble();
        double log10Value = Math.log10(log10Number);
        System.out.println("The base 10 logarithm of " + log10Number + " is: " + log10Value);
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("");

        //Exponential function
        System.out.print("Enter a number for exponential: ");
        double expNumber = scanner.nextDouble();
        double expValue = Math.exp(expNumber);
        System.out.println("The exponential of " + expNumber + " is: " + expValue);

        scanner.close();
    }
}
