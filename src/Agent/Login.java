package Agent;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import semua page disini ya gaes
import Agent.Home.*;

public class Login extends JFrame {
    private JButton homeButton;
    private JButton orderButton;
    private JButton booksButton;
    private JPasswordField insertYourPasswordPasswordField;
    private JTextField textField1;
    private JButton masukButton;
    private JPanel LoginPanel ;
    JFrame frame;

    public Login() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(LoginPanel);
        this.pack();
        masukButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame =  new Home();
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame =  new Login();
        frame.setVisible(true);
    }
}
