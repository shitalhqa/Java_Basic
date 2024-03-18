package Basic;

import java.util.Scanner;

public class findFactorialNumber {

    public static void factorialNumber(int n){
        int factorial = 1;
        for(int i = n; i >= 1 ; i--)
        {
            factorial = factorial * i;
        }
        System.out.println( factorial);
        return;
    }

    public static void main(String[] args) {
        System.out.println("Enter Number for which factorial is calculate ");
        Scanner Number = new Scanner(System.in);
        int n = Number.nextInt();
        factorialNumber(n);
      }
}
