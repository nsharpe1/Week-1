import java.util.Scanner;
import java.util.*;
public class Exercise1{
    //
    
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a one-digit number");
        n = input.nextInt();

        //float c = 2.5f;
       if (n == 0) {
        System.out.println("Zero");
       }
       if (n == 1) {
        System.out.println("One");
       }
       if (n == 2) {
        System.out.println("Two");
       }
       if (n == 3) {
        System.out.println("Three");
       }
       if (n == 4) {
        System.out.println("Four");
       }
       if (n == 5) {
        System.out.println("Five");
       }
       if (n == 6) {
        System.out.println("Six");
       }
       if (n == 7) {
        System.out.println("Seven");
       }
       if (n == 8) {
        System.out.println("Eight");
       }
       if (n == 9) {
        System.out.println("Nine");
       }
       if (n >= 10) {
        System.out.println("Invalid number!");
       }

    }
    ///

}