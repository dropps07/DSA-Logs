package Code.day3;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  //10
        int b = sc.nextInt();  //20
        int c = sc.nextInt();  //30
        
        //find the largest of the 3 no.
        int max =0;
        if(a>max){
            max=a;
        }else{
            max=b;
        }
        if(c>max){
            max=c;
        }
        // max = Math.max(c, Math.max(a,b));
        System.out.println(max);
    }
}
