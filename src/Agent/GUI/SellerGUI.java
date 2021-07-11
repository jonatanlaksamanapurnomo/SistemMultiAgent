package Agent.GUI;


import JadeAgent.SellerAgent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SellerGUI extends JFrame {
    private JPanel HomePanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton sellBookNowButton;
    private JLabel statusLabel;
    SellerAgent sellerAgent;

    public SellerGUI(SellerAgent sellerAgent) {
        this.setContentPane(HomePanel);
        this.pack();
        this.sellerAgent = sellerAgent;
        sellBookNowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = textField1.getText().trim();
                String price = textField2.getText().trim();
                sellerAgent.updateCatalogue(title, Integer.parseInt(price));
                System.out.println(sellerAgent.getStatus());
                statusLabel.setText(sellerAgent.getStatus());
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
