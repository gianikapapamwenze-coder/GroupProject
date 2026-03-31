import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Working with Layouts (GridLayouts)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setLayout(new GridLayout(1, 3));

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.BLUE);

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);

        frame.setVisible(true);
    }
}