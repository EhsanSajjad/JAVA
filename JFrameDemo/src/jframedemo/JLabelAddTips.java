
package jframedemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelAddTips extends JFrame{
    
    private Container c;
    private Font f;
    private JLabel L1;
    
    JLabelAddTips()
    {
        JLabelTips();
    }
    
    public void JLabelTips()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        f = new Font("Arial", Font.BOLD, 20);
        
        L1 = new JLabel("Enter your name : ");
        //L1.setText("Enter your name : "); // both are same
        L1.setBounds(50, 50, 300, 100);
        L1.setBackground(Color.yellow);
        L1.setFont(f);
        c.add(L1);
        
        L1.setToolTipText("Write your name");
        
        System.out.println(" "+L1.getText());
        
        String s = L1.getToolTipText();
        System.out.println(s);
        
    }
    
    public static void main(String[] args) {
        
        JLabelAddTips frame = new JLabelAddTips();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JLabelAddTips.EXIT_ON_CLOSE);
        frame.setBounds(900, 100, 400, 450);
        frame.setTitle("Tips adding frame");
        
    }
    
}
