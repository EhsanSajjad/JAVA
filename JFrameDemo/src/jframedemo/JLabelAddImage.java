
package jframedemo;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class JLabelAddImage extends JFrame {    
    
    private Container c;
    private JLabel L1;
    private ImageIcon img;
        
    JLabelAddImage()
    {
        inputImage();
    }
    
    public void inputImage()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        img = new ImageIcon(getClass().getResource("overseas.jpg"));
        
        L1 = new JLabel(img);
        L1.setBounds(20, 20, img.getIconWidth(), img.getIconHeight());
        c.add(L1);
        
    }
    
    public static void main(String[] args) {
        
        JLabelAddImage frame = new JLabelAddImage();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JLabelAddTips.EXIT_ON_CLOSE);
        frame.setBounds(900, 100, 400, 450);
        frame.setTitle("Image adding frame");
        
    }
    
}
