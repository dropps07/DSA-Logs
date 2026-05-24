package Code.day2;
import java.util.*;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (int) (65.78f); //explicitely storing float value in int
        System.out.println(num);

        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = (a*b)/c;
    }
}