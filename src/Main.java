import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit){
            case "Mango":
                System.out.println("King of fruit");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case"Orange":
                System.out.println("Rounded fruit");
                break;
            case"Grapes":
                System.out.println("small fruit");
                break;
            default:
                System.out.println("please enter valid fruit");
        }

        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("Today is Monday");
            case 2 -> System.out.println("Today is Tuesday");
            case 3 -> System.out.println("Today is Wednesday");
            case 4 -> System.out.println("Today is Thursday");
            case 5 -> System.out.println("Today is Friday");
            case 6 -> System.out.println("Today is Saturday");
            case 7 -> System.out.println("Today is Sunday");
            default -> System.out.println("Please the enter the enter the valid");
        }
    }
}