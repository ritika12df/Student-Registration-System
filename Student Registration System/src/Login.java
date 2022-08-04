import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
	private final JTextField textField;
	private final JPasswordField passwordField;
	private final JButton b1;



	public Login() {

		setBackground(new Color(169, 169, 169));
		setBounds(600, 300, 600, 400);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(168, 101, 201));
		setContentPane(panel);
		panel.setLayout(null);

		JLabel l1 = new JLabel("Name : ");
		l1.setBounds(124, 89, 95, 24);
		l1.setForeground(new Color(255, 255, 255));
		panel.add(l1);

		JLabel l2 = new JLabel("Password : ");
		l2.setBounds(124, 124, 95, 24);
		l2.setForeground(new Color(255, 255, 255));
		panel.add(l2);

		textField = new JTextField();
		textField.setBounds(210, 93, 157, 20);
		panel.add(textField);

		passwordField = new JPasswordField();
		passwordField.setBounds(210, 128, 157, 20);
		panel.add(passwordField);

		JLabel l3 = new JLabel("");
		l3.setBounds(377, 79, 46, 34);
		panel.add(l3);

		JLabel l4 = new JLabel("");
		l4.setBounds(377, 124, 46, 34);
		panel.add(l3);

		b1 = new JButton("Login");
		b1.addActionListener(this);

		b1.setForeground(new Color(255, 255, 255));
		b1.setBackground(new Color(0, 0, 0));
		b1.setBounds(149, 181, 113, 39);
		panel.add(b1);


		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(168, 101, 201));
		panel2.setBounds(24, 40, 434, 263);
		panel.add(panel2);
	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == b1){
			Boolean status = false;
			try {
				conn con = new conn();
				String sql = "select * from admin where name=? and password=?";
				PreparedStatement st = con.c.prepareStatement(sql);

				st.setString(1, textField.getText());
				st.setString(2, passwordField.getText());

				ResultSet rs = st.executeQuery();
				if (rs.next()) {
					this.setVisible(false);
					new Home().setVisible(true);
				} else
					JOptionPane.showMessageDialog(null, " Login Credentials doesn't exists");

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}


	}

	public static void main(String[] args) {
		new Login().setVisible(true);
	}

}