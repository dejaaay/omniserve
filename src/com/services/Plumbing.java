package com.services;
import alternatoveass.AlternatoveAss;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Plumbing extends JFrame implements ActionListener
{
JLabel lblimg, lblhelper, lblname, lbladdress, lblcontact, lbldate, lbltime, lblduration, lblrate;
JTextField txtname, txtaddress, txtcontact, txtdate, txttime, txtduration;
JButton btnproceed, btnclear, btnback;
    String uHome = System.getProperty("user.home");
    String fSeparator = System.getProperty("file.separator");
    String path = uHome + fSeparator + "alterenative.csv";
public Plumbing ()
 {
        super("Input Details");
        setLayout(null);
        Icon icon = new ImageIcon("C:\\Users\\DJ\\Desktop\\altimg\\plumbing.png");
        lblimg =new JLabel (icon);
        lblhelper =new JLabel ("Helper");
        lblname =new JLabel ("Name:");
        lbladdress =new JLabel ("Address:");
        lblcontact =new JLabel ("Contact No:");
        lbldate =new JLabel ("Date:");
        lbltime =new JLabel ("Time:");
        lblduration =new JLabel ("Duration:");
        lblrate =new JLabel ("$10 per hr:");
        txtname = new JTextField ();
        txtaddress = new JTextField ();
        txtcontact = new JTextField ();
        txtdate = new JTextField ();
        txttime = new JTextField ();
        txtduration = new JTextField ();
        btnproceed = new JButton ("Proceed");
        btnclear =new JButton ("Clear");
        btnback = new JButton("Back");
        btnproceed.addActionListener(this);
        btnback.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                if (e.getSource()==btnback)
                {
                dispose();
                AlternatoveAss alt= new AlternatoveAss();
                alt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
        });
        btnclear.addActionListener (new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txtname.setText("");
                txtaddress.setText("");
                txtcontact.setText("");
                txtdate.setText("");
                txttime.setText("");
                txtduration.setText("");
               
            }
        });
        txtduration.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e) {
        
                char c =e.getKeyChar();
                if (!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_ENTER)){
                    e.consume();
                    JOptionPane.showMessageDialog(null,"Please Input Number.","Error",JOptionPane.ERROR_MESSAGE);
               
            }}
        });
        lblimg.setBounds(140,10,80,80);  
        //name
        lblname.setBounds(50,126,100,30);
        txtname.setBounds(50,150,233,30);
        //address
        lbladdress.setBounds(50,176,100,30);
        txtaddress.setBounds(50,200,233,30);
        //contact
        lblcontact.setBounds(50,226,100,30);
        txtcontact.setBounds(50,250,233,30);
        //date
        lbldate.setBounds(50,276,100,30);
        txtdate.setBounds(50,300,233,30);
        //time
        lbltime.setBounds(50,326,100,30);
        txttime.setBounds(50,350,233,30);
        //duration
        lblduration.setBounds(50,386,100,30);
        txtduration.setBounds(50,410,233,30);
        //normal labels
        lblrate.setBounds(50,435,80,30);
        lblhelper.setBounds(160,90,80,30);
        //buttons
        btnproceed.setBounds(50,500,100,30);
        btnclear.setBounds(180,500,100,30);
        btnback.setBounds (10,10,80,30);
        //adding
        add(lblimg);add(lblname);add(lbladdress);add(lblcontact);add(lbldate);add(lbltime);add(lblduration);add(lblrate);add(lblhelper);
        add(txtname);add(txtaddress);add(txtcontact);add(txtdate);add(txttime);add(txtduration);
        add(btnproceed);add(btnclear);add(btnback);
        
        // setting
        setSize(350,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
        
        
        
   
    
 } 

    public double compute (int hours,int rate){
        return (hours * rate);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String name="", address="",date="", rate="",duration="", contact="",time="";
        double Rate;
        
                                 if(txtname.getText().equals(""))
                                       name="Name Is Empty \n";
                                 if (txtaddress.getText().equals(""))
                                     address="Address Is Empty \n";
                                 if (txtcontact.getText().equals(""))
                                     contact="Contact Is Empty \n"; 
                                 if (txtdate.getText().equals(""))
                                     date="Date Is Empty \n";                                 
                                 if (txttime.getText().equals(""))
                                     time="Time Is Empty \n";
                                 if (txtduration.getText().equals(""))
                                     duration="Duration Is Empty \n";
                                 else if(Integer.parseInt(txtduration.getText())<1)
                                 duration="Number of Hours Work Should Be Greater Than 0";
                                 String N;
                                 if(name!="" || address!="" || date!="" || rate!="" || duration!="" || contact!="" || time!="")
                                 JOptionPane.showMessageDialog(null,name+address+contact+date+time+duration,"ERROR",JOptionPane.ERROR_MESSAGE);
                                else
                                 {
				if (e.getSource()==btnproceed)
                                {
                                    Inputs input =new Inputs();
                                    input.setName(txtname.getText());
                                    input.setAddress(txtaddress.getText());
                                    input.setDate(txtdate.getText());
                                    input.setRate(10);
                                    input.setHours(Integer.parseInt(txtduration.getText()));
                                    input.setContact(txtcontact.getText());
                                    input.setTime(txttime.getText());
                                    N=input.showDetails();
                                    Rate= compute(input.getRate(),input.getHours());
                                    System.out.println(path);
				try 
                                {
			               PrintWriter file=new PrintWriter(new FileWriter(path,true));
                                       BufferedReader br = new BufferedReader (new FileReader(path));
			                if (br.readLine()==null)
			                    file.println("Name, Address, Contact No, Date, Time, Rate, Duration, Price");
			                String emp = N+","+ Rate;
                                        String G = ""+Rate;
			                file.println(emp);
			                file.close();
  
			        }
			        catch (IOException err) {
						System.err.println("File not found");
			        }
                                dispose(); 
                                Summary summary =new Summary();
                                summary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                
                                }
			}
}
}
