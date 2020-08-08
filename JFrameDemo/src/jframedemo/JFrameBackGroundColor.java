
package jframedemo;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.ImageIcon;


public class JFrameBackGroundColor extends JFrame {
    
    JFrameBackGroundColor()
    {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(1000,150,260,300);
        
        ImageIcon icon = new ImageIcon(getClass().getResource("overseas.jpg"));
        this.setIconImage(icon.getImage());
         
        Container c = this.getContentPane();
        c.setBackground(Color.green);
    }
    
    public static void main(String[] args) {
        
        JFrameBackGroundColor frame = new JFrameBackGroundColor();
        
    }
    
}
