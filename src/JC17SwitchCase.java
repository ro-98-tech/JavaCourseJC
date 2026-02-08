import java.util.Scanner;

public class JC17SwitchCase {
    public static void main(String[] args) {

        int weekDay;
        Scanner input=new Scanner(System.in);

        //Data entry
        System.out.println("What's the number of the day?");
        weekDay=input.nextInt();

        switch (weekDay){
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Invalid day number.");
        }
    }
}
