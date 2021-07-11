package Agent.GUI;

import JadeAgent.BuyerAgent;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import semua page disini ya gaes


public class Main extends JFrame {
    private JButton homeButton;
    private JButton buyerButton;
    private JPanel LoginPanel;
    JFrame frame;

    public Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(LoginPanel);
        this.pack();

        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] bootOptions = new String[6];
                bootOptions[0] = "-local-port";
                bootOptions[1] = "1020";
                bootOptions[2] = "-container-name";
                bootOptions[3] = "SMA_Container";
                bootOptions[4] = "-agents";
                bootOptions[5] = "SystemMultiAgent:JadeAgent.SellerAgent;";
                jade.Boot.main(bootOptions);
            }
        });
        buyerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jade.core.Runtime runtime = jade.core.Runtime.instance();
                Profile profile = new ProfileImpl();
                profile.setParameter(Profile.CONTAINER_NAME, "SMA_Container");
                profile.setParameter(Profile.MAIN_HOST, "localhost");
                ContainerController container = runtime.createAgentContainer(profile);
                try {
                    AgentController ag = container.createNewAgent("BuyerAgent",
                            "JadeAgent.BuyerAgent",
                            new Object[]{});//arguments
                    ag.start();
                } catch (StaleProxyException er) {
                    er.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new Main();
        frame.setVisible(true);
    }
}
