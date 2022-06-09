
package com.services;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Confirmation extends JFrame implements ActionListener
{
JLabel lblimg, lblhelper, lblname, lbladdress, lblcontact, lbldate, lbltime, lblduration, lblrate,txtname, txtaddress, txtcontact, txtdate, txttime, txtduration,lblprice;
JButton btnconfirm;

     public  Confirmation(String n, String a, String d, String c, String t,int du, int r) {
          
         super("Summary");
          
         setLayout(null);
     
        Icon icon = new ImageIcon("C:\\Users\\DJ\\Desktop\\altimg\\helper.png");
        lblimg =new JLabel (icon);
        lblhelper =new JLabel ("Helper");
        lblname =new JLabel ("Name: "+n);
        lbladdress =new JLabel ("Address: "+ a);
        lblcontact =new JLabel ("Contact No: "+c);
        lbldate =new JLabel ("Date: "+d);
        lbltime =new JLabel ("Time: "+t);
        lblduration =new JLabel ("Duration: "+r);
        lblprice = new JLabel ("Bill: " +du);
        btnconfirm = new JButton("Confrim");
        btnconfirm.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                if (e.getSource()==btnconfirm)
                {
                dispose();
                
                ThankYou thanks = new ThankYou(); 
                thanks.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
        });
        //txtduration = new JLabel ();
        lblimg.setBounds(140,10,80,80);  
        //name
        lblname.setBounds(50,126,200,30);
        //contact
        lblcontact.setBounds(50,226,200,30);
        //address
        lbladdress.setBounds(50,176,200,30);
        //date
        lbldate.setBounds(50,276,200,30);
        //pricing
        lblprice.setBounds (50,435,100,30);
        //time
        lbltime.setBounds(50,326,200,30);
        //duration
        lblduration.setBounds(50,386,200,30);
        //normal labels
        lblhelper.setBounds(160,90,80,30);
        //button
        btnconfirm.setBounds(50,500,100,30);
        
        add(lblimg);add(lblname);add(lbladdress);add(lblcontact);add(lbldate);add(lbltime);add(lblduration);add(lblhelper);add(lblprice);
        add(btnconfirm);
        //add(txtname);add(txtaddress);add(txtcontact);add(txtdate);add(txttime);add(txtduration);

     setSize(350,600);
     setLocationRelativeTo(null);

     setResizable(false);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
