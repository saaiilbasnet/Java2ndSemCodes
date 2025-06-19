import javax.swing.*;

public class SimpleGUI{
public static void main(String[] args) {
 
    JFrame frame = new JFrame("Simple GUI");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,500);

     
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Enter your name");
    JTextField textfield = new JTextField(25);
    JButton button = new JButton("Submit");

    button.addActionListener(e ->{
        String name = textfield.getText();
        JOptionPane.showMessageDialog(frame, "Hello " + name);
    });

    panel.add(label);
    panel.add(textfield);
    panel.add(button);
    frame.add(panel);

    frame.setVisible(true);

}
}