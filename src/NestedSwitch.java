import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

        switch (empId){
            case 1:
                System.out.println("Ashish kumar");
                break;
            case 2:
                System.out.println("Sonam kumari");
                break;
            case 3:
                System.out.println("Emp number 3");
                switch (department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Entered the correct empID");
        }
    }
}
