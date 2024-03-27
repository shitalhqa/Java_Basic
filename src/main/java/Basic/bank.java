package Basic;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
public class bank {
    private int pwd;
    private double bal =5000;

    public void deposit (double money) {
        System.out.println("Enter password ");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if(pwd == 123456){
            bal = bal + money;
            System.out.println("Deposit Amount = " + " " + money);
            System.out.println("Total Balance Amount is " + " " + bal);
        }
     else {
            System.out.println("Incorrect Password,.... " +
                    "Please Enter Correct Password");
        }
    }
    public void withdraw(double money){
        System.out.println("Enter password ");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if(pwd == 123456)
        {
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
            case 2 : Bank.withdraw(1000);
            break;
            case 3 : Bank.deposit(5000);
            break;
            default:
                System.out.println(" Invalid choice ... is enter");
        }

    }
}

}
