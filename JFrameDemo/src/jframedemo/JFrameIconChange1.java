
package jframedemo;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrameIconChange1 extends JFrame {
    
    private ImageIcon icon;
    
    //this is a construction
    JFrameIconChange1()
    {
        setVisible(true);
        setDefaultCloseOperation(JFrameIconChange1.EXIT_ON_CLOSE);
        setBounds(1045, 140, 280, 330);
        setTitle("Look at the Icon!!");
        
        initComponent();
    }
    
    // this is a mathod
    public void initComponent()
    {
        icon = new ImageIcon(getClass().getResource("overseas.jpg"));
        this.setIconImage(icon.getImage());
    }
    
    public static void main(String[] args) {
        
        JFrameIconChange1 frame = new JFrameIconChange1();      
               
    }    
}
