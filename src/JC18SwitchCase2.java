import java.util.Scanner;

public class JC18SwitchCase2 {
    public static void main(String[] args) {

        int weekDay;
        Scanner input=new Scanner(System.in);

        //Data entry
        System.out.println("Write the number of the day of the week (1-7): ");
        weekDay=input.nextInt();

        switch (weekDay){
            case 1-> System.out.println("Today is Monday");
            case 2-> System.out.println("Today is Tuesday");
            case 3-> System.out.println("Today is Wednesday");
            case 4-> System.out.println("Today is Thursday");
            case 5-> System.out.println("Today is Friday");
            case 6-> System.out.println("Today is Saturday");
            case 7-> System.out.println("Today is Sunday");
            default->System.out.println("Invalid day number.");
        }
        input.close();
    }
}
