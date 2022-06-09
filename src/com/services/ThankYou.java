package com.services;
import alternatoveass.AlternatoveAss;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ThankYou extends JFrame implements ActionListener{
	JLabel lblimg;
	JButton btnexit, btnhome;
        
	public ThankYou() {
		super("Thank you!");
		setLayout(null);
		Icon icon = new ImageIcon("C:\\Users\\DJ\\Desktop\\altimg\\ty.png");
		lblimg = new JLabel (icon);
                btnhome = new JButton ("Home");
                btnexit = new JButton ("Exit");
                btnhome.addActionListener(new ActionListener(){
                public void actionPerformed (ActionEvent e){
                if (e.getSource()==btnhome)
                {
                dispose();
                AlternatoveAss alt= new AlternatoveAss();
                }
                }
                });
                btnexit.addActionListener(new ActionListener(){
                public void actionPerformed (ActionEvent e){
                if (e.getSource()==btnhome)
                {
                dispose();
                }
                }
                });
		lblimg.setBounds(35,30,460,500);
                btnhome.setBounds(100,100,100,30);
                btnexit.setBounds(200,100,100,30);
		add(lblimg);
                add(btnhome);
                add(btnexit);
                
		
        setSize(540,600);
        setVisible(true);
        setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	    }
}