
package jframedemo;

import javax.swing.JFrame;

public class JFrame1 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(250, 300);
        //frame.setLocationRelativeTo(null);
        //frame.setLocation(1045, 140);
        frame.setBounds(1045, 140, 280, 330);   //(location, size)
        frame.setTitle("Aha!! ki moja...");
        //frame.setResizable(false);
        
    }
    
}
