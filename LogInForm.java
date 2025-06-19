import javax.swing.*;

public class LogInForm{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        JPanel panel = new JPanel();

        JLabel label1 = new JLabel("Username: ");
        JTextField textField1 = new JTextField(20);

        JLabel label2 = new JLabel("Password: ");
        JTextField textField2 = new JTextField(20 );

        JButton button = new JButton("Login");

        button.addActionListener(e -> {
            String username = textField1.getText();
            String password = textField2.getText();
            // JOptionPane.showMessageDialog(frame, "Hello "+username+"\n Your Password : "+password);
            // JOptionPane.showMessageDialog(frame, "Your Password : "+password);

            //authentication

            if(username.equals("admin") && password.equals("pass")){
                JOptionPane.showMessageDialog(frame, "Login Successful!");
            }else{
                 JOptionPane.showMessageDialog(frame, "Login Failed!");
            }

        });

        panel.add(label1);
        panel.add(textField1);

        panel.add(label2);
         panel.add(textField2);

        panel.add(button);
        frame.add(panel);

        frame.setVisible(true);

    }
}