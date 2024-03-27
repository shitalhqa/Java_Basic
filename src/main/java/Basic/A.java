package Basic;

import java.util.Scanner;

public class A {
 void show(){
     System.out.println("Voting Eligibility check ");
 }
}
class B extends A {
 void show(int a){
   //  super.show();
     System.out.println("Your age is" + "  " + a );
     if (a >= 18 ){
         System.out.println("Your Eligible for Voting");
     }
     else {
         System.out.println( "Your Not Eligible for Voting");
     }
 }
}
class test{
    public static void main(String[] args) {
        B shital = new B();
       A shital1 = new A();
        shital1.show();
        System.out.println("Enter Your Age: ");
        Scanner Age = new Scanner(System.in);
        int a = Age.nextInt();
        shital.show(a);

    }
}
