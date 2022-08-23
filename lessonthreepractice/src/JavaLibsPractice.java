import java.util.Scanner;

class JavaLibsPractice {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("==(0/10)== Create Your Own Story, Answer All Questions as prompted. ==== \n");

        System.out.println("==(1/10)== Declare First Name. Hit Enter. ====");
        String firstName = sc.next();

        System.out.println("==(2/10)== Declare Place. Hit Enter. ====");
        String Place = sc.next();

        System.out.println("==(3/10)== Declare Pronoun She/him. Hit Enter. ====");
        String Pronoun = sc.next();

        System.out.println("==(4/10)== Declare Pronouns Her/his. Hit Enter. ====");
        String Pronouns = sc.next();


        System.out.println("==(5/10)== Declare daughter/son. Hit Enter. ====");
        String Child = sc.next();

        System.out.println("==(6/10)== Declare pronoun for daughter/son. Hit Enter. ====");
        String ChildPronoun = sc.next();

        System.out.println("==(7/10)== Declare Boy/Girl. Hit Enter. ====");
        String Childgender= sc.next();

        System.out.println("==(8/10)== Declare a country. Hit Enter. ====");
        String Country= sc.next();


        System.out.println("==(9/10)== Declare a nationality. Hit Enter. ====");
        String nationality= sc.next();



        System.out.println("==(10/10)== Questions Complete. Type any character and Hit Enter to Begin Reading. ====");
        String z = sc.next();


        System.out.println("A mom’s job is never truly finished—"+firstName+"  knew this instinctively when "+Pronouns+" "+Child+" was born.\n" +
                "For at least the hundredth time, "+Pronoun+" sat next to  "+ChildPronoun+" bed in that chair mending "+ChildPronoun+"  quilt.\n" +
                "There was no way of knowing, the day "+Pronoun+" bought it at a "+Place+", that it would become\n" +
                ""+Pronouns+" "+Child+"’s most valued possession");

        System.out.println("To call it a quilt stretched the definition as it was nothing more than a thousand pieces \n" +
                "of oddly shaped swatches stitched together, layer after layer, until the whole of it was \n" +
                "thick enough to hold in the warmth of a small "+Childgender+"'s body as "+ChildPronoun+"  drifted off to sleep. The \n" +
                "person who pieced together this labor of love must have spent countless hours shaping the \n" +
                "useless remnants into a usable blanket. "+firstName+" felt it was "+Pronouns+" duty to repair the inevitable \n" +
                "rips as an homage to the unknown creator and as a manifestation of "+Pronouns+" adoration for the little \n" +
                ""+Childgender+"  who cherished it.");


        System.out.println("“I love how cool it feels when I first get into bed,”  "+Pronouns+" little "+Childgender+" observed the first night " +
                " "+ChildPronoun+" wrapped himself in the old quilt. “But before long, it warms up, and " + "I’m snug as a bug in a rug. Where did you get it?”");

 System.out.println(" "+firstName+" stretched the truth just a little. “It’s made from pieces of fabric from all over "+Country+" and is the \n" +
         "first blanket used by the first "+nationality+"s .");


        System.out.println("========  Thanks for Reading! press enter to read again ====");
        String r = sc.next();
        sc.close();

    }
}