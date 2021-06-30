package Agent;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Home  extends JFrame {
    private JButton homeButton;
    private JButton orderButton;
    private JButton booksButton;
    private JPanel HomePanel;
    JFrame frame;
    public Home(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(HomePanel);
        this.pack();
    }

    public static void main(String[] args) {

    }


}
