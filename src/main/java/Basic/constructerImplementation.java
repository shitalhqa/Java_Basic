package Basic;

public class constructerImplementation {

    int i;
    String name;
    constructerImplementation(){
        i = 100;
        name = "Ram";
        System.out.println("Age is" + " "+ i + " "+ "Name is" + name );
    }


    public static void main(String[] args) {
       constructerImplementation Implementation = new constructerImplementation();
    }
}

