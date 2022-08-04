import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class UpdateStudentDetails extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField t1, t2, t3;
    private JComboBox comboBox, comboBox_1, comboBox_2, comboBox_3;
    JButton b1, b2;


    public static void main(String[] args) {
        new UpdateStudentDetails().setVisible(true);
    }


    public UpdateStudentDetails() {
        super("UpdateStudentsDetails");
        setBounds(700, 200, 400, 450);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel l1 = new JLabel("Student_id");
        l1.setForeground(new Color(255, 255, 255));
        l1.setFont(new Font("Tahoma", Font.BOLD, 14));
        l1.setBounds(64, 63, 102, 22);
        contentPane.add(l1);

        JLabel l2 = new JLabel("Name");
        l2.setForeground(new Color(255, 255, 255));
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setBounds(64, 97, 102, 22);
        contentPane.add(l2);

        JLabel l3 = new JLabel("Father's Name");
        l3.setForeground(new Color(255, 255, 255));
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        l3.setBounds(64, 130, 105, 22);
        contentPane.add(l3);

        JLabel l4 = new JLabel("Branch");
        l4.setForeground(new Color(255, 255, 255));
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setBounds(64, 209, 102, 22);
        contentPane.add(l4);

        JLabel l5 = new JLabel("Year");
        l5.setForeground(new Color(255, 255, 255));
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        l5.setBounds(64, 242, 102, 22);
        contentPane.add(l5);

        JLabel l6 = new JLabel("Semester");
        l6.setForeground(new Color(255, 255, 255));
        l6.setFont(new Font("Tahoma", Font.BOLD, 14));
        l6.setBounds(64, 275, 102, 22);
        contentPane.add(l6);

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

        comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[]{"ECE", "CSE", "IT", "Civil", "Mechanical", "EEE", "Other"}));
        comboBox.setForeground(new Color(47, 79, 79));
        comboBox.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        comboBox.setBounds(176, 211, 154, 20);
        contentPane.add(comboBox);

        comboBox_1 = new JComboBox();
        comboBox_1.setModel(new DefaultComboBoxModel(new String[]{"First", "Second", "Third", "Four"}));
        comboBox_1.setForeground(new Color(47, 79, 79));
        comboBox_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        comboBox_1.setBounds(176, 244, 154, 20);
        contentPane.add(comboBox_1);

        comboBox_2 = new JComboBox();
        comboBox_2.setModel(
                new DefaultComboBoxModel(new String[]{"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th"}));
        comboBox_2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        comboBox_2.setForeground(new Color(47, 79, 79));
        comboBox_2.setBounds(176, 277, 154, 20);
        contentPane.add(comboBox_2);

        b1 = new JButton("Update");
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

        JLabel l7 = new JLabel("Course");
        l7.setForeground(new Color(255, 255, 255));
        l7.setFont(new Font("Tahoma", Font.BOLD, 14));
        l7.setBounds(64, 173, 102, 22);
        contentPane.add(l7);

        comboBox_3 = new JComboBox();
        comboBox_3.setModel(new DefaultComboBoxModel(
                new String[]{"B.E", "B.Tech", "M.Tech", "MBA", "BBA", "BCA", "B.Sc", "M.Sc", "B.Com", "M.Com"}));
        comboBox_3.setForeground(new Color(47, 79, 79));
        comboBox_3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        comboBox_3.setBounds(176, 176, 154, 20);
        contentPane.add(comboBox_3);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 0), 2, true), "UpdateStudentdetails",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        panel.setBackground(new Color(0, 0, 0));
        panel.setBounds(10, 38, 358, 348);

        contentPane.setBackground(Color.WHITE);
        panel.setBackground(Color.MAGENTA);

        contentPane.add(panel);

    }

    public void actionPerformed(ActionEvent ae) {
        String Name,Year,Semester;
        Name = t2.getText();
        Year = (String)comboBox_1.getSelectedItem();
       Semester = (String)comboBox_2.getSelectedItem();


        try {


            if (ae.getSource() == b1) {
                try {
                    conn con = new conn();
                    String sql = ("update student set year = ?,semester = ? where name = ?");
                    PreparedStatement st = con.c.prepareStatement(sql);
                    st.setString(1,Year);
                    st.setString(2, Semester);
                    st.setString(3,Name );

                    int i = st.executeUpdate();
                    if (i > 0) {
                        JOptionPane.showMessageDialog(null, "SUCCESSFULLY UPDATED STUDENT DETAILS");
                        this.setVisible(false);
                        new Home().setVisible(true);


                    } else
                        JOptionPane.showMessageDialog(null, "ERROR ");
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
