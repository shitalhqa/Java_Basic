package Basic;

import java.util.Scanner;

public class Natural_Number_Print {
    public static void main(String[] args) {

        int Number;
        System.out.println("Enter Number for finding natural number");
        Scanner Manual_Enter_Number = new Scanner(System.in);
         Number = Manual_Enter_Number.nextInt();
         do {
             System.out.println(Number);
             -- Number;
         }
         while (Number >= 0);
    }
}
