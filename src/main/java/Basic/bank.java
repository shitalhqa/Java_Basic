package Basic;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
public class bank {
    private int pwd;
    private double bal =5000;

    public void deposit () {
        System.out.println("Enter password ");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if(pwd == 123456){
            System.out.println("Enter Deposit Amount :");
            Scanner drawAmt = new Scanner(System.in);
            double money = drawAmt.nextDouble();
            bal = bal + money;
            System.out.println("Deposit Amount = " + " " + money);
            System.out.println("Total Balance Amount is " + " " + bal);
        }
     else {
            System.out.println("Incorrect Password,.... " +
                    "Please Enter Correct Password");
        }
    }
    public void withdraw(){
        System.out.println("Enter password ");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if(pwd == 123456)
        {
            System.out.println("Enter Amount of withdraw");
            Scanner drawAmt = new Scanner(System.in);
            double  money = drawAmt.nextDouble();
            bal = bal - money;
            System.out.println("Withdraw Amount is : " + money);
            System.out.println("Total Balance Amount is: " + bal);
        }
        else
        {
            System.out.println("Incorrect Password,.... " +
                    "Please Enter Correct Password");
        }
        }
    public void checkBalance() {
        System.out.println("Enter password ");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if(pwd == 123456)
        {
            System.out.println( " Balance Amount is: " + bal);
        }
   }
static class customer{
    public static void main(String[] args) {
        bank Bank = new bank();
        double a;
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Amount");
        System.out.println("3. Deposit Amount ");
        int choice;
        System.out.println("Enter your choice Number");
        Scanner ch = new Scanner(System.in);
        choice = ch.nextInt();
        switch (choice)
        {
            case 1 : Bank.checkBalance();
            break;
            case 2 : Bank.withdraw();
            break;
            case 3 : Bank.deposit();
            break;
            default:
                System.out.println(" Invalid choice ... is enter");
        }

    }
}

}
