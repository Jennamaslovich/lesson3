public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;
        double price =12;
        double tax=7.4;
        int quantity=2;
        double totalPrice=(price * quantity); // this finds the total

        totalPrice +=totalPrice * tax / 100.0;
        message= custName +"wants to purchase"+quantity+""+itemDesc;


        System.out.println(message);
        System.out.printf("Total cost with tax is $25.78");






    }
}
