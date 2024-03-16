package Basic;

import java.util.Scanner;

public class New_Strings {
    public static void main(String[] args) {
        String Enter_Name;
        System.out.println(" Enter Your Name");
        Scanner Enter_Names = new Scanner(System.in);
        Enter_Name = Enter_Names.nextLine();
       // String Enter_Name = "Shital";
        System.out.println( Enter_Name.toUpperCase());
    }
}
