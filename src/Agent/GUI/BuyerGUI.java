package Agent.GUI;

import JadeAgent.BuyerAgent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuyerGUI extends JFrame {
    private JTextField insertBookNameTextField;
    private JPanel BuyerPanel;
    private JButton buyButton;
    private JLabel statusLabel;
    private BuyerAgent buyerAgent;

    public BuyerGUI(BuyerAgent buyerAgent) {
        this.setContentPane(BuyerPanel);
        this.pack();
        this.buyerAgent = buyerAgent;
        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = insertBookNameTextField.getText().trim();
                buyerAgent.buy(title);
            }
        });

    }

    public void show() {
        pack();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int centerX = (int) screenSize.getWidth() / 2;
        int centerY = (int) screenSize.getHeight() / 2;
        setLocation(centerX - getWidth() / 2, centerY - getHeight() / 2);
        super.show();
    }

}
