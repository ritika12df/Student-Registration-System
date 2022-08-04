import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class aboutUs extends JFrame{
    public aboutUs() {
        super("About Us");
        JLabel l3 = new JLabel("Student Registration System");
        l3.setFont(new Font("Sans serif", Font.BOLD | Font.ITALIC, 34));
        l3.setBounds(100, 40, 500, 55);
        l3.setOpaque(true);
       l3.setBackground(Color.PINK);
        add(l3);
        setSize(500,550);
}

    public static void main(String[] args) {

        new aboutUs().setVisible(true);
    }
}