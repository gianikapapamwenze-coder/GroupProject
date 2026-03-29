import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {

    public static void main(String[] args) {

        // Create the main window
        JFrame frame = new JFrame("BorderLayout Demo");

        // Set layout
        frame.setLayout(new BorderLayout());

        // NORTH region - Title
        JLabel titleLabel = new JLabel("Application Title");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        frame.add(titleLabel, BorderLayout.NORTH);

        // WEST region - Buttons
        JPanel westPanel = new JPanel();
        westPanel.setLayout(new GridLayout(3, 1));

        JButton button1 = new JButton("Option 1");
        JButton button2 = new JButton("Option 2");
        JButton button3 = new JButton("Option 3");

        westPanel.add(button1);
        westPanel.add(button2);
        westPanel.add(button3);

        frame.add(westPanel, BorderLayout.WEST);

        // CENTER region - Text area with scroll
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // SOUTH region - Submit button
        JButton submitButton = new JButton("Submit");
        frame.add(submitButton, BorderLayout.SOUTH);

        // Frame settings
        frame.setSize(600, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
