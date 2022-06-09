
package alternatoveass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Launchpad extends JFrame implements ActionListener
{
JLabel lblimg;
JButton btnenter, btnexit;  
public Launchpad ()
{
        super("Omniserve");
        setLayout(null);
        Icon icon = new ImageIcon("C:\\Users\\DJ\\Desktop\\altimg\\helper.png");
        lblimg =new JLabel (icon);
        btnenter =new JButton("Enter");
        btnexit =new JButton("Exit");
        btnenter.addActionListener(this);
        btnexit.addActionListener(this);
        
        lblimg.setBounds(100,90,150,80);
        btnenter.setBounds(70,250,200,30);
        btnexit.setBounds(70,300,200,30);
        
        
        add(lblimg);
        add(btnenter); add(btnexit);
        setSize(350,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
}
 @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnenter)
                {
                dispose();
                AlternatoveAss alt= new AlternatoveAss();
                alt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
        if (e.getSource()==btnexit)
        {
            dispose();
        }
    }
    public static void main(String[] args) 
    {
        Launchpad launch =new Launchpad();
        launch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   
    
}
