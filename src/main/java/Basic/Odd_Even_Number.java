package Basic;

import java.util.Scanner;

public class Odd_Even_Number {
    public static void main(String[] args) {
        int Number;
        System.out.println("Enter Number");
        Scanner Entered_Number = new Scanner(System.in);
        Number = Entered_Number.nextInt();
        while ( Number >= 0) {
            if (Number % 2 == 0) {
                System.out.println("Even Number");
                break;
            } else {
                System.out.println("Odd Number");
                break;
            }
            // System.out.println("while Loop end");
        }
    }
}
