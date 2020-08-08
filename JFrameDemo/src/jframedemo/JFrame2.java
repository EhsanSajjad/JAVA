
package jframedemo;

import javax.swing.JFrame;

public class JFrame2 extends JFrame {
    
    JFrame2()
    {            
        setVisible(true);
        setDefaultCloseOperation(JFrame2.EXIT_ON_CLOSE);
        setBounds(50, 100, 300, 250);
        setTitle("Sajjad");        
    }
    
    
    public static void main(String[] args) {
        
        JFrame2 frame = new JFrame2();           
    }
    
}
