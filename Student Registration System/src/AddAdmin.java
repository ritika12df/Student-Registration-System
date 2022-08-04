import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class AddAdmin extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField t1, t2, t3;

    JButton b1, b2;

    public static void main(String[] args) {
        new AddAdmin().setVisible(true);
    }




    public AddAdmin() {
        super("Add Admin");
        setBounds(700, 200, 400, 450);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel l1 = new JLabel("Name");
        l1.setForeground(new Color(255, 255, 255));
        l1.setFont(new Font("sans-serif", Font.BOLD, 14));
        l1.setBounds(64, 63, 102, 22);
        contentPane.add(l1);

        JLabel l2 = new JLabel("Email");
        l2.setForeground(new Color(255, 255, 255));
        l2.setFont(new Font("sans-serif", Font.BOLD, 14));
        l2.setBounds(64, 97, 102, 22);
        contentPane.add(l2);

        JLabel l3 = new JLabel("Password");
        l3.setForeground(new Color(255, 255, 255));
        l3.setFont(new Font("sans-serif", Font.BOLD, 14));
        l3.setBounds(64, 130, 102, 22);
        contentPane.add(l3);


        t1 = new JTextField();
        t1.setEditable(true);
        t1.setForeground(new Color(47, 79, 79));
        t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t1.setBounds(174, 66, 156, 20);
        contentPane.add(t1);
        t1.setColumns(10);

        t2 = new JTextField();
        t2.setForeground(new Color(47, 79, 79));
        t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t2.setColumns(10);
        t2.setBounds(174, 100, 156, 20);
        contentPane.add(t2);

        t3 = new JTextField();
        t3.setForeground(new Color(47, 79, 79));
        t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t3.setColumns(10);
        t3.setBounds(174, 133, 156, 20);
        contentPane.add(t3);


        b1 = new JButton("Add Admin");
        b1.addActionListener(this);
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        b1.setBounds(64, 321, 111, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);

        b2 = new JButton("Back");
        b2.addActionListener(this);
        b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        b2.setBounds(198, 321, 111, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        contentPane.add(b2);




        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 0), 2, true), "Add-Admin details",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        panel.setBackground(new Color(0, 0, 0));
        panel.setBounds(10, 38, 358, 348);

        contentPane.setBackground(Color.WHITE);
        panel.setBackground(Color.MAGENTA);

        contentPane.add(panel);

    }

    public void actionPerformed(ActionEvent ae) {
        try {

            if (ae.getSource() == b1) {
                try {
                    conn con = new conn();
                    String sql = "insert into admin( name, email, password) values(?, ?, ?)";
                    PreparedStatement st = con.c.prepareStatement(sql);
                    st.setString(1, t1.getText());
                    st.setString(2, t2.getText());
                    st.setString(3, t3.getText());

                    int i = st.executeUpdate();
                    if (i > 0) {
                        JOptionPane.showMessageDialog(null, "SUCCESSFULLY ADDED ADMIN DETAILS");
                        this.setVisible(false);
                        new Home().setVisible(true);
                    } else
                        JOptionPane.showMessageDialog(null, "ERROR GENERATED");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (ae.getSource() == b2) {
                this.setVisible(false);
                new Home().setVisible(true);
            }
        } catch (Exception e) {

        }
    }
}