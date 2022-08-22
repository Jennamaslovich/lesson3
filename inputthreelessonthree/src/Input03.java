import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Type Integer, Hit Enter to Confirm.");
        int x =sc.nextInt();
        System.out.println("Integer 1 Confirmed");
        int y =sc.nextInt();
        System.out.println("Integer 2 Confirmed");
        int z =sc.nextInt();
        System.out.println("Integer 3 Confirmed");

        System.out.println("Adding Integers");
        System.out.println(x+y+z);
        sc.close();
        

    }
}
