package Basic;

public class Two_Dimensional_Array {
    public static void main(String[] args) {

        String x[][] = new String[2][2];
        x[0][0] = "Shital";
        x[0][1] = "Rahul";
        x[1][0] = "SR";
        x[1][1] = "RS";

        for(int row= 0; row < x.length; row++)
        {
            for(int col =0; col < x[0].length; col++)
            {
                System.out.println(x[row][col]);
            }
        }
    }

}
