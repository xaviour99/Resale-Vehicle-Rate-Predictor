package login;
import login.database;
import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class loginin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblPassword;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginin frame = new loginin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param btnSignUp 
	 */
	public loginin() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent LOGIN) {
				String u1=textField.getText();
				String p1=textField_1.getText();
				System.out.println(u1+' '+p1);
				
				database obj=new database();
				int id=obj.verify(u1,p1);
				cal.main(id);
				
			}
		});
		

		btnNewButton.setBounds(113, 110, 117, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(16, 18, 88, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(16, 59, 88, 16);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(100, 18, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(100, 55, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Using for \nthe first time ?!");
		lblNewLabel_2.setBounds(51, 135, 161, 16);
		contentPane.add(lblNewLabel_2);
		
		JButton btnSignUP= new JButton("Sign UP");
		btnSignUP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent SignUp) {
				System.out.println("hi");
				signup.main();
				}
			
		});
		btnSignUP.setBounds(212, 130, 117, 29);
		contentPane.add(btnSignUP);
	}
}
