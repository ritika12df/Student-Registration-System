import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;

public class DeleteStudentDetails extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField t1;

	JButton b1, b2;


	public static void main(String[] args) {
		new DeleteStudentDetails().setVisible(true);
	}


	public DeleteStudentDetails() {
		super("Delete Student details");
		setBounds(700, 200, 400, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);



		JLabel l1 = new JLabel("Name");
		l1.setForeground(new Color(255, 255, 255));
		l1.setFont(new Font("Tahoma", Font.BOLD, 14));
		l1.setBounds(64, 63, 102, 22);
		contentPane.add(l1);

		t1 = new JTextField();
		t1.setForeground(new Color(47, 79, 79));
		t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t1.setColumns(10);
		t1.setBounds(174, 66, 156, 20);
		contentPane.add(t1);


		b1 = new JButton("Delete");
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
		panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 0), 2, true), "DeleteStudentdetails",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(10, 38, 358, 348);

		contentPane.setBackground(Color.WHITE);
		panel.setBackground(Color.MAGENTA);

		contentPane.add(panel);

	}

	public void actionPerformed(ActionEvent ae) {
		String Name;
		Name = t1.getText();
		try {


			if (ae.getSource() == b1) {
				try {
					conn con = new conn();
					String sql = ("delete from student where name = ?");
					PreparedStatement st = con.c.prepareStatement(sql);
					st.setString(1,Name);

					int i = st.executeUpdate();
					if (i > 0) {
						JOptionPane.showMessageDialog(null, "SUCCESSFULLY DELETED STUDENT DETAILS");
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
