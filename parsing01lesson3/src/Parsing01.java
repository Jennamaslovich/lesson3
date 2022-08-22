public class Parsing01 {
    public static void main(String[] args) {

        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish


        String shirtPrice="15";
        String taxRate="0.05";
        String gibberish ="887ds7nds87dsfs";
        
        
        //Parse shirtPrice and taxRate, and print the total tax


         double price = Double.parseDouble(shirtPrice);
         double taxRt= Double.parseDouble(taxRate);
         double tax= price * taxRt;
         System.out.println("Total tax:"+tax);
        
        
        //Try to parse taxRate as an int

        try {
            int i = Integer.parseInt(taxRate);
        }catch(Exception e){

            System.out.println(e);
        }
        
        //Try to parse gibberish as an int

        try {
            int i = Integer.parseInt(gibberish);
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
