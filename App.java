import javax.swing.*;
import java.util.*;
import java.net.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App{
  public static JFrame mainWindow;

  public static void main(String[] args) {
    welcome();
  }
  public static void welcome(){
    //Creating jframe window
    mainWindow = new JFrame("Coinverter");
    mainWindow.setSize(750, 100);
    mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainWindow.setVisible(true);

    //Elements
    JPanel welcomePanel = new JPanel();
    JLabel welcomeLabel = new JLabel("Welcome to Coinverter!");
    welcomeLabel.setFont(new Font("Serif", Font.PLAIN, 20));
    JButton startButton = new JButton("Start coinverting!");
    startButton.setFont(new Font("Serif", Font.PLAIN, 20));
    startButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        mainWindow.setSize(750, 750);
        mainWindow.remove(welcomePanel);
        coinverting();
      }
    });
    welcomePanel.add(welcomeLabel);
    welcomePanel.add(startButton, BorderLayout.PAGE_END);

    mainWindow.add(welcomePanel);
  }
  public static void coinverting(){
    JPanel labelPanel = new JPanel();
    JLabel values = new JLabel("Here your values!");
    labelPanel.add(values);
    mainWindow.add(labelPanel);

    JPanel valuesPanel = new JPanel();
    JLabel uaIconPlacing = new JLabel();
    uaIconPlacing.setIcon(new ImageIcon("./values/ua.png"));
    valuesPanel.add(uaIconPlacing);
    mainWindow.add(valuesPanel);
  }
}
