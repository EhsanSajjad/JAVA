
package jframedemo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class BorderLayoutDemo extends JFrame{
    
    private Container c;
    private BorderLayout bLayout;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private JLabel L1;
    
    BorderLayoutDemo()
    {
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        this.setBounds(400, 200, 420, 350);
        
        
        bLayout = new BorderLayout(10,10);
//        bLayout.setHgap(20);
//        bLayout.setVgap(10);
        c.setLayout(bLayout);
        
        L1 = new JLabel("klfdsjf");
        L1.setBounds(100, 50, 50, 50);
        //c.add(L1, BorderLayout.WEST);
        
        
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        
        c.add(btn1, BorderLayout.NORTH);
        c.add(btn2, BorderLayout.EAST);
        c.add(btn3, BorderLayout.SOUTH);
        c.add(btn4, BorderLayout.WEST);
        c.add(btn5, BorderLayout.CENTER);
        
    }
    
    public static void main(String[] args) {
        
        BorderLayoutDemo frame = new BorderLayoutDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(BorderLayoutDemo.DISPOSE_ON_CLOSE);
        frame.setTitle("Border Layout Demo");
        
    }
    
}
