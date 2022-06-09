package alternatoveass;
import com.services.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

public class AlternatoveAss extends JFrame implements ActionListener
{
    JLabel lbltitle, lblhelper, lblelectric, lblplumbing, lblhandyman;
    JButton btnhelper, btnelectric, btnplumbing, btnhandyman;
    ButtonGroup bgN;
    public AlternatoveAss ()
    {
        super("Omniverse");
        setLayout(null);
        lbltitle =new JLabel ("Omniserve");
        lblhelper =new JLabel ("Helper");
        lblelectric =new JLabel ("Electric");
        lblplumbing =new JLabel ("Plumbing");
        lblhandyman =new JLabel ("Handyman");
        Icon icon = new ImageIcon("C:\\Users\\DJ\\Desktop\\altimg\\helper.png");
        btnhelper = new JButton(icon);
        Icon icon1 = new ImageIcon("C:\\Users\\DJ\\Desktop\\altimg\\electrician.png");
        btnelectric = new JButton(icon1);
        Icon icon2 = new ImageIcon("C:\\Users\\DJ\\Desktop\\altimg\\plumbing.png");
        btnplumbing = new JButton(icon2);
        Icon icon3 = new ImageIcon("C:\\Users\\DJ\\Desktop\\altimg\\handyman.png");
        btnhandyman = new JButton(icon3);
        btnhelper.addActionListener(this);
        btnelectric.addActionListener(this);
        btnplumbing.addActionListener(this);
        btnhandyman.addActionListener(this);
        lbltitle.setBounds(140,10,100,30);
        lblhelper.setBounds(78, 150, 80, 30);
        lblelectric.setBounds(208, 150, 80, 30);
        lblplumbing.setBounds(75, 300, 80, 30);
        lblhandyman.setBounds(200, 300, 80, 30);
        btnhelper.setBounds(60,60,80,80);
        btnelectric.setBounds(190,60,80,80);
        btnplumbing.setBounds(60,210,80,80);
        btnhandyman.setBounds(190,210,80,80);
        add(btnhelper);add(btnelectric);add(btnplumbing);add(btnhandyman);
        add(lbltitle);
        add(lblhelper);
        add(lblelectric);
        add(lblplumbing);
        add(lblhandyman);
        setSize(350,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false); 
        setBackground(new Color(100,125,105));
        
    }
     public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==btnhelper)
        {
            dispose();
            Helper helper= new Helper();
            helper.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        else if(e.getSource()==btnelectric)
        {
            dispose ();
            Electric electric = new Electric();
            electric.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        else if (e.getSource()== btnplumbing)
        {
            dispose ();
            Plumbing plumbing = new Plumbing ();
            plumbing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        else if (e.getSource()== btnhandyman)
        {
            dispose();
            Handyman handyman = new Handyman();
            handyman.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    

    
   
    
}
