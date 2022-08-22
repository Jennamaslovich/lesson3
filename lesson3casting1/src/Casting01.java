public class Casting01 {
    public static void main(String[] args) {


        byte b = (byte) 128; // will be -128 when we run app
        short s = 128;
        System.out.println((byte) s); // will be -128


        byte b2 = 127;
        b2++;
        System.out.println(b2); //will be -128
        b2++;
        System.out.println(b2); //will be -127

    }

}







