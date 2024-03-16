package Basic;

import java.io.InputStream;
import java.util.Scanner;

public class Array {
    int b;
    public static void main(String[] args) {
        int i [] = new int[4];

        System.out.println(i.length);
        System.out.println("Enter four number ");
        Scanner InputValue = new Scanner(System.in);
        // int i[4] = InputValue.nextInt();
       i[0] = InputValue.nextInt();
        i[1] = InputValue.nextInt();
        i[2] = InputValue.nextInt();
        i[3] = InputValue.nextInt();
      //  i[4] = InputValue.nextInt(); // when data is enter more than the array size gives error "Index 4 out of bounds for length 4"
        Array obj = new Array();
       obj.shital();
    }
    public int shital(){

        int a[] = {10, 20, 30,40,50};
        for ( int b:a)
        {
            System.out.println(b);
        }
        return b;
    }
}
