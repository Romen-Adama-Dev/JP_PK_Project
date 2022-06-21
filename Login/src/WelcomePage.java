import javax.swing.*;
import java.awt.*;

class WelcomePageAdmin {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hello!");

    WelcomePageAdmin(String userID){

        welcomeLabel.setBounds(0,0,200,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
        welcomeLabel.setText("Welcome " + userID);
        welcomeLabel.setForeground(Color.RED);

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setBackground(Color.white);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

class WelcomePageTeacher {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hello!");

    WelcomePageTeacher(String userID){

        welcomeLabel.setBounds(0,0,200,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
        welcomeLabel.setText("Welcome " + userID);
        welcomeLabel.setForeground(Color.BLUE);

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setBackground(Color.white);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

class WelcomePageStudent {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hello!");

    WelcomePageStudent(String userID){

        welcomeLabel.setBounds(0,0,200,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
        welcomeLabel.setText("Welcome " + userID);
        welcomeLabel.setForeground(Color.GREEN);

        frame.setForeground(Color.white);
        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setBackground(Color.white);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
/*
    @author
    Romen Adama Caetano Ramirez
    Date: 17/01/2022
 */