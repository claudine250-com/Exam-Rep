import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RP Ngoma College");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel title = new JLabel("Welcome to RP Ngoma College", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(title, BorderLayout.NORTH);

        JLabel subtitle = new JLabel("Providing quality education and skills for the future.", SwingConstants.CENTER);
        panel.add(subtitle, BorderLayout.CENTER);

        frame.add(panel);
        frame.setVisible(true);
    }
 
}
