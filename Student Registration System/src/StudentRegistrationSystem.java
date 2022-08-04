import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class StudentRegistrationSystem extends JFrame implements ActionListener{

        JLabel l1;
        JButton b1;
        
        public StudentRegistrationSystem() {
		
                setSize(1366,450);
                setLayout(null);
                setLocation(300,300);

		l1 = new JLabel("");
                b1 = new JButton("PROCEED");
                
                b1.setBackground(Color.YELLOW);
                b1.setForeground(Color.BLACK);
				
                

                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/Orange and Blue Photo Sunset Good Evening Facebook  Post.png"));
                Image i3 = i1.getImage().getScaledInstance(1366, 390,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                
                b1.setBounds(1050,250,200,60);
		        l1.setBounds(0, 0, 1366, 390);
                
                l1.add(b1);
		        add(l1);
                
                b1.addActionListener(this);
	}
        
        public void actionPerformed(ActionEvent ae){
                new Login().setVisible(true);
                this.setVisible(false);
                
        }
        
        public static void main(String[] args) {
                StudentRegistrationSystem window = new StudentRegistrationSystem();
                window.setVisible(true);			
	}
}