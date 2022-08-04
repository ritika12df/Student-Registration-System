import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

    private final JButton b1;
    private final JButton b2;
    private final JButton b3;
    private final JButton b4;
    private final JButton b5;


	public static void main(String[] args) {
            new Home().setVisible(true);
	}
        
        public Home() {
	
            setBounds(400, 150, 1000, 800);
            JPanel contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            
            JMenuBar menuBar = new JMenuBar();
            menuBar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 128, 0), new Color(128, 128, 128)));
            menuBar.setBackground(Color.MAGENTA);
            menuBar.setBounds(0, 10, 1000, 35);
            contentPane.add(menuBar);

            JMenu mnExit = new JMenu("Exit");
            mnExit.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
            
            
            JMenuItem mntmLogout = new JMenuItem("Logout");
            mntmLogout.setBackground(new Color(211, 211, 211));
            mntmLogout.setForeground(new Color(105, 105, 105));
            mntmLogout.addActionListener(this);
            mnExit.add(mntmLogout);
            
            JMenuItem mntmExit = new JMenuItem("Exit");
            mntmExit.setForeground(new Color(105, 105, 105));
            mntmExit.setBackground(new Color(211, 211, 211));
            mntmExit.addActionListener(this);
            mnExit.add(mntmExit);
                
            

            JMenu mnHelp = new JMenu("Help");
            mnHelp.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
            

            JMenuItem mntmReadme = new JMenuItem("Read Me");
            mntmReadme.setBackground(new Color(211, 211, 211));
            mntmReadme.setForeground(new Color(105, 105, 105));
            mnHelp.add(mntmReadme);

            JMenuItem mntmAboutUs = new JMenuItem("About Us");
            mntmAboutUs.setForeground(new Color(105, 105, 105));
            mntmAboutUs.setBackground(new Color(211, 211, 211));
            mntmAboutUs.addActionListener(this);
            mnHelp.add(mntmAboutUs);

            menuBar.add(mnHelp);
            menuBar.add(mnExit);
            
            JLabel l1 = new JLabel("Student Registration System");
            l1.setForeground(new Color(0, 0, 0));
            l1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 30));
            l1.setBounds(268, 30, 701, 80);
            contentPane.add(l1);

            JLabel l2 = new JLabel("");
            l2.setVerticalAlignment(SwingConstants.TOP);
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/add Student.png"));
            Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l2 = new JLabel(i3);
            l2.setBounds(60, 140, 159, 152);
            contentPane.add(l2);

            JLabel l3 = new JLabel("");
            ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("icons/pngfind.com-students-png-658184.png"));
            Image i5 = i4.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i6 = new ImageIcon(i5);
            l3 = new JLabel(i6);
            l3.setBounds(300, 160, 225, 152);
            contentPane.add(l3);

            JLabel l4 = new JLabel("");
            ImageIcon i7  = new ImageIcon(ClassLoader.getSystemResource("icons/delete-icon-png-16x16-28.jpg"));
            Image i8 = i7.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i9 = new ImageIcon(i8);
            l4 = new JLabel(i9);
            l4.setBounds(530, 140, 225, 152);
            contentPane.add(l4);

            JLabel l5 = new JLabel("");
            ImageIcon i10  = new ImageIcon(ClassLoader.getSystemResource("icons/add admin.png"));
            Image i11 = i10.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i12 = new ImageIcon(i11);
            l5 = new JLabel(i12);
            l5.setBounds(60, 440, 159, 163);
            contentPane.add(l5);


            JLabel l6 = new JLabel("");
            ImageIcon i13  = new ImageIcon(ClassLoader.getSystemResource("icons/seventh.png"));
            Image i14 = i13.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i15 = new ImageIcon(i14);
            l6 = new JLabel(i15);
            l6.setBounds(332, 440, 139, 152);
            contentPane.add(l6);


            b1 = new JButton("Add Students");
            b1.addActionListener(this);
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.WHITE);
            b1.setBounds(60, 320, 159, 44);
            contentPane.add(b1);

            b2 = new JButton("Update Student details");
            b2.addActionListener(this);
            b2.setBackground(Color.BLACK);
            b2.setForeground(Color.WHITE);
            b2.setBounds(313, 320, 165, 44);
            contentPane.add(b2);

            b3 = new JButton("Delete Student details");
            b3.addActionListener(this);
            b3.setBackground(Color.BLACK);
            b3.setForeground(Color.WHITE);
            b3.setBounds(562, 320, 167, 44);
            contentPane.add(b3);


            b4 = new JButton("Add Admin");
            b4.addActionListener(this);
            b4.setBackground(Color.BLACK);
            b4.setForeground(Color.WHITE);
            b4.setBounds(76, 620, 143, 41);
            contentPane.add(b4);

            b5 = new JButton("About Us");
            b5.addActionListener(this);
            b5.setBackground(Color.BLACK);
            b5.setForeground(Color.WHITE);
            b5.setBounds(310, 620, 159, 41);
            contentPane.add(b5);


	}
        
        
        public void actionPerformed(ActionEvent ae){
            String msg = ae.getActionCommand();
            switch (msg) {
                case "Logout":
                    setVisible(false);
                    new Login().setVisible(true);
                    break;
                case "Exit":
                    System.exit(ABORT);

                case "Read Me":

                    break;
                case "About Us":
                    setVisible(false);
                    new aboutUs().setVisible(true);

                    break;
            }

            
            if(ae.getSource() == b1){
                this.setVisible(false);
                new AddStudent().setVisible(true);
            }
            if(ae.getSource() == b2){
                this.setVisible(false);
                new UpdateStudentDetails().setVisible(true);
            }
            if(ae.getSource() == b3){
                this.setVisible(false);
                new DeleteStudentDetails().setVisible(true);
            }
            if(ae.getSource() == b4){
                this.setVisible(false);
                new AddAdmin().setVisible(true);
            }

            if(ae.getSource() == b5){
                this.setVisible(false);
                new aboutUs().setVisible(true);
            
            }
            
        }
}
