package Code.day4;
import java.util.*;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();
        int day = sc.nextInt(); 
        switch (fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Banana" -> System.out.println("dominator");
            default -> System.out.println("Normal fruit");
        }

        switch (day) {
            case 1,2,3,4,5 -> System.out.println("working days");
            case 6,7 -> System.out.println("weekdays");
        }
        int empID = sc.nextInt();
        switch (empID){
            case 1:
                System.out.println("Aditi");
                break;
            case 2:
                System.out.println("Monosoni");
                break;
            case 3:
                System.out.println("Horshita");
                break;
            case 4:
                System.out.println("empID 4");
                String department= sc.next();
                switch (department){
                    case "IT" :
                        System.out.println("IT DEPARTMENT");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                    default:
                        System.out.println("no dept");
                }
            default:
                System.out.println("Enter correct ID");
        }
    }
}