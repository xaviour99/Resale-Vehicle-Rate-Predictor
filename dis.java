package login;
import java.util.*;
import login.Biler;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dis extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	int carid;
	int ussid;
	double value2;
	/**
	 * Launch the application.
	 */
	public static void main(int id,int usid,String s1) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dis frame = new dis(id,usid,s1);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	public void SUV(int id,int ussid) {
		List<Biler> o1=new ArrayList<Biler>();
		database o2=new database();
		o1.addAll(o2.SUV(id,ussid));
		float value;
		double value1 =0 ;
		
		
	System.out.println("size"+o1.size());
		for(int i=0;i<o1.size();i++)
		{
			Biler b=new Biler(o1.get(i));
			System.out.println(b.s1);
		  value=Integer.parseInt(b.s2)/(2020-Integer.parseInt(b.s1));
		  System.out.println(value);
		  carid=b.i3;
		  if(value<=20000)
		  {
			  value1=b.i2-(b.i2*0.20);
		  }
		  if(value>=50000)
		  {
			  value1=b.i2-(b.i2*0.30);
		  }
		  if(value>=100000)
		  {
			  value1=b.i2-(b.i2*0.45);
		  }
		  System.out.println(value1);
		 
		
		if (b.i1==1)
		{
			value2=value1-(b.i2*0.05);
			
		}
		 if(b.i1==2)
		{
			value2=value1-(b.i2*0.1);
		}
		if(b.i1>2)
		{
			value2=value1-(b.i2*0.15);
		}
		System.out.println("values is "+value2);
		}
		textField.setText(String.valueOf(value2));
		System.out.println(+ussid);
		
	}
	public void Seaden(int id,int ussid) {
		List<Biler> o1=new ArrayList<Biler>();
		database o2=new database();
		o1.addAll(o2.Seaden(id,ussid));
		float value;
		double value1 =0 ;
		
		
	System.out.println("size"+o1.size());
		for(int i=0;i<o1.size();i++)
		{
			Biler b=new Biler(o1.get(i));
			System.out.println(b.s1);
		  value=Integer.parseInt(b.s2)/(2020-Integer.parseInt(b.s1));
		  System.out.println(value);
		  carid=b.i3;
		  if(value<=20000)
		  {
			  value1=b.i2-(b.i2*0.20);
		  }
		  if(value>=50000)
		  {
			  value1=b.i2-(b.i2*0.30);
		  }
		  if(value>=100000)
		  {
			  value1=b.i2-(b.i2*0.45);
		  }
		  System.out.println(value1);
		 
		
		if (b.i1==1)
		{
			value2=value1-(b.i2*0.05);
			
		}
		 if(b.i1==2)
		{
			value2=value1-(b.i2*0.1);
		}
		if(b.i1>2)
		{
			value2=value1-(b.i2*0.15);
		}
		System.out.println("values is "+value2);
		}
		textField.setText(String.valueOf(value2));
		System.out.println(+ussid);
		
	}
	public void HatchBag(int id,int ussid) {
		List<Biler> o1=new ArrayList<Biler>();
		database o2=new database();
		o1.addAll(o2.HatchBag(id,ussid));
		float value;
		double value1 =0 ;
		
		
	System.out.println("size"+o1.size());
		for(int i=0;i<o1.size();i++)
		{
			Biler b=new Biler(o1.get(i));
			System.out.println(b.s1);
		  value=Integer.parseInt(b.s2)/(2020-Integer.parseInt(b.s1));
		  System.out.println(value);
		  carid=b.i3;
		  if(value<=20000)
		  {
			  value1=b.i2-(b.i2*0.20);
		  }
		  if(value>=50000)
		  {
			  value1=b.i2-(b.i2*0.30);
		  }
		  if(value>=100000)
		  {
			  value1=b.i2-(b.i2*0.45);
		  }
		  System.out.println(value1);
		 
		
		if (b.i1==1)
		{
			value2=value1-(b.i2*0.05);
			
		}
		 if(b.i1==2)
		{
			value2=value1-(b.i2*0.1);
		}
		if(b.i1>2)
		{
			value2=value1-(b.i2*0.15);
		}
		System.out.println("values is "+value2);
		}
		textField.setText(String.valueOf(value2));
		System.out.println(+ussid);
		
	}

	 
	 

	/**
	 * Create the frame.
	 */
	public dis(int id,int usid,String s1) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculate current market price");
		lblNewLabel.setBounds(6, 30, 190, 16);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(208, 25, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		 
		//textField.setText();
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				database o1=new database();
				o1.updatet(id,carid,textField.getText(),usid);
			}
		});
		//database function(carid,id)
		btnNewButton.setBounds(118, 154, 117, 29);
		contentPane.add(btnNewButton);
		if(s1.contentEquals("SUV"))
		{
		SUV(id,usid);
		}
		else
		if(s1.contentEquals("HatchBag"))
		{
			HatchBag(id,usid);
		}
		else {
		Seaden(id,usid );
		}
		System.out.println(+id);
		
	}

}
