import javax.swing.*;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
//String input = JOptionPane.showInputDialog("Type your name");


        //Parse the input as an int.
        //Print its value +1
//int input2= Integer.parseInt(input);


        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        int input2= Integer.parseInt(JOptionPane.showInputDialog("Type your Name"));

        System.out.println(++input2);
    }
}
