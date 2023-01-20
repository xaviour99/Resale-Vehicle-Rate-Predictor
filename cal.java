package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class cal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	int cal;
	/**
	 * Launch the application.
	 */
	public static void main(int id ) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cal frame = new cal(id);
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
	public cal(int id) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("No.of Owners ");
		lblNewLabel.setBounds(6, 18, 106, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Year Of Purchase");
		lblNewLabel_1.setBounds(6, 46, 106, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Kilometers Driven");
		lblNewLabel_2.setBounds(6, 74, 120, 16);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(137, 13, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 41, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(137, 69, 130, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JCheckBox chckbxSuv = new JCheckBox("SUV");
		chckbxSuv.setBounds(137, 96, 61, 23);
		contentPane.add(chckbxSuv);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Seaden");
		chckbxNewCheckBox_1.setBounds(224, 98, 83, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("HatchBag");
		chckbxNewCheckBox_2.setBounds(301, 98, 106, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		
		textField_3 = new JTextField();
		textField_3.setBounds(137, 131, 130, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

	
		
		JButton btnNewButton = new JButton("Calculate ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = null;
				
				String ow=textField.getText();
				String yr=textField_1.getText();
				String kd=textField_2.getText();
				String cr=textField_3.getText();
				
				if(chckbxSuv.isSelected())
				{
					s1=chckbxSuv.getText();
				}
				if(chckbxNewCheckBox_1.isSelected())
				{
					s1=chckbxNewCheckBox_1.getText();
				}
				if(chckbxNewCheckBox_2.isSelected())
				{
					s1=chckbxNewCheckBox_2.getText();
				}
				
				if( ow!= null)
				{
					database obj=new database();
					cal = obj.cal(ow,yr,kd,s1,cr,id);
					
				}
				
			      System.out.println("hi");
			      dis.main(id,cal,s1);
		}
		});
		btnNewButton.setBounds(118, 192, 117, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Car Type");
		lblNewLabel_3.setBounds(6, 102, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Car type no");
		lblNewLabel_4.setBounds(6, 136, 83, 16);
		contentPane.add(lblNewLabel_4);

		
		JLabel lblNewLabel_5 = new JLabel("suv =1, seaden=2, hatch bag =3");
		lblNewLabel_5.setBounds(118, 156, 221, 26);
		contentPane.add(lblNewLabel_5);
		


	}
}
