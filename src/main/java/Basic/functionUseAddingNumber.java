package Basic;

import java.util.Scanner;

public class functionUseAddingNumber {
    public static int calculation( int a,  int b)
    {
        int sum = a + b;
        return sum;
    }
public  static int multiplication(int a, int b)
{
        int multiplication = a * b;
        return multiplication;
}

    public static void main(String[] args) {
        Scanner twoNumbers = new Scanner(System.in);
        System.out.println("Enter Two Number for Addition");
        int a = twoNumbers.nextInt();
        int b = twoNumbers.nextInt();
        int sum = calculation(a,b);
        int multiplication = multiplication(a,b);
        System.out.println("Addition of Two number is :" +  sum);
        System.out.println("Multiplication of Two number is :" +  multiplication);

    }

}
