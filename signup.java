package login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class signup extends JFrame {


	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	protected String ad;
	protected String uid;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup frame = new signup();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public signup() {
		setTitle("Signup");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);        
		
		JLabel lblNewLabel_5 = new JLabel("***Invalid phone number");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setBounds(19, 73, 374, 16);
		lblNewLabel_5.setVisible(false);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblinvalidEmailAddress = new JLabel("***Invalid email address");
		lblinvalidEmailAddress.setForeground(Color.RED);
		lblinvalidEmailAddress.setBounds(19, 159, 400, 16);
		lblinvalidEmailAddress.setVisible(false);
		contentPane.add(lblinvalidEmailAddress);
		
		
		
		
		
		JLabel lblNewLabel = new JLabel(" USER NAME ");
		lblNewLabel.setBounds(6, 6, 100, 16);
		contentPane.add(lblNewLabel);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("PHONE NUMBER");
		lblNewLabel_1.setBounds(6, 40, 100, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("EMAIL ID");
		lblNewLabel_2.setBounds(6, 68, 76, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ADDRESS");
		lblNewLabel_3.setBounds(6, 101, 76, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("PASSWORD");
		lblNewLabel_4.setBounds(6, 129, 76, 16);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(118, 1, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(118, 35, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(118, 63, 130, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(118, 91, 130, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(118, 124, 130, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Cancle");
		btnNewButton.setBounds(131, 183, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_5.setVisible(false);
				lblinvalidEmailAddress.setVisible(false);
				String un=textField.getText();
				String email=textField_2.getText();
				boolean u=true,e2=true;
				String phone=textField_1.getText();
				if(phone.length()!=10)
				{
					u=false;
					System.out.println("here");
					
					lblNewLabel_5.setVisible(true);

					contentPane.revalidate();
					textField_1.setText("");
				}
				if(!email.contains("@"))
				{
					e2=false;
					lblinvalidEmailAddress.setVisible(true);
					contentPane.revalidate();
					
				}
				
			
				if(u && e2)
				{
				
				lblNewLabel_5.setVisible(false);
				lblinvalidEmailAddress.setVisible(false);
				contentPane.revalidate();
				database obj=new database();
				String pass=textField_4.getText();
				String addr1=textField_3.getText();
				obj.signup(un,phone,email,addr1,pass);
				}
				
				
				
				
			}

			public void actionPerformed1(ActionEvent e) {
				
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(btnNewButton_1,"Hello, Welcome to Javatpoint."); 
				
			}
		});

		btnNewButton_1.setBounds(286, 183, 117, 29);
		contentPane.add(btnNewButton_1);
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(71, 85, 5, 5);
		contentPane.add(tabbedPane);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("New tab", null, tabbedPane_1, null);
		 
		
		
	}

}
