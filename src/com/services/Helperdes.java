package com.services;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Helperdes extends JFrame implements ActionListener{
	JLabel lblbody, lblimg;
	
	public Helperdes () {
		super("Description");
		setLayout(null);
		Icon icon = new ImageIcon("C:\\Users\\Louie\\Desktop\\icons\\1.png");
        lblimg =new JLabel (icon);
		lblbody = new JLabel();
														//, ,TXTLENGTH,			
		lblbody.setBounds(50,80,100,500);
		
		lblbody.setText("The all around helper has the skills to clean and fix \n any house problems and situations. Availing this will let you have a personal all around helper for 350/hr."
				+ " We assure you that all of our staffs and employees have undergone a thorough screening during the hiring process to ensure that they are trusted and reliable at all "
				+ "times and to give you quality services");
		
		add(lblbody);add(lblimg);
		
		lblimg.setBounds(140,10,80,80);
		setSize(350,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false); 
        getContentPane().setBackground(new java.awt.Color(110, 153, 153));
         
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}