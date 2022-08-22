import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Questions about you",
                "Title",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "What is your favorite Food?",
                "Dialog Title",
                2,
                null,
                null,
                "Type something here.");
        
        
        String[] acceptableValues = {"Female", "Male", "Non-binary"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "What is your gender?",
                "Dialog Title",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
}
