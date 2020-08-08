
package jframedemo;

import java.awt.Container;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class JLabelDemo extends JFrame {
    
    private Container c;
    private JLabel userLabel, userLabel2;
        
    JLabelDemo()
    {
        initComponent();
    }
    
    public void initComponent()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        
        userLabel = new JLabel();
        userLabel.setText("Enter your username : ");
        c.add(userLabel);
        userLabel.setBounds(100, 50, 200, 100);
        
        userLabel2 = new JLabel("Enter your password : ");
        userLabel2.setBounds(100, 70, 200, 100);
        c.add(userLabel2);
        
    }
    
    public static void main(String[] args) {
        
        JLabelDemo frame = new JLabelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JLabelDemo.EXIT_ON_CLOSE);
        frame.setBounds(900, 130, 400, 400);
        frame.setTitle("JLabelDemo Frame...");
        
    }
    
}
