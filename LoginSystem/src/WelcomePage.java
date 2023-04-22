import javax.swing.*;
import java.awt.*;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Now Running The Client");
    JLabel welcomeTwoLabel = new JLabel("Now Installing The Client");
    JLabel welcomeThreeLabel = new JLabel("Please Wait ...");
    JLabel welcomeFourLabel = new JLabel("Thanks For Choosing Us");

    WelcomePage(String userID) {


        welcomeLabel.setBounds(0, 0, 700, 35);
        welcomeLabel.setFont(new Font(null, Font.BOLD,25));
        welcomeLabel.setText("Hello " + userID );

        welcomeTwoLabel.setBounds(0, 30, 700, 35);
        welcomeTwoLabel.setFont(new Font(null, Font.PLAIN,25));

        welcomeThreeLabel.setBounds(0, 60, 700, 35);
        welcomeThreeLabel.setFont(new Font(null, Font.PLAIN,25));

        welcomeFourLabel.setBounds(0, 90, 700, 35);
        welcomeFourLabel.setFont(new Font(null, Font.PLAIN,25));


        frame.add(welcomeThreeLabel);
        frame.add(welcomeFourLabel);
        frame.add(welcomeTwoLabel);
        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,190);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
