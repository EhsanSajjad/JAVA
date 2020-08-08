
package jframedemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class AddListener_anotherMathod extends JFrame implements ActionListener{
    
    private Container c;
    private JButton btn1, btn2, btn3;
    
    AddListener_anotherMathod()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        this.setBounds(400, 200, 420, 350);
        
        btn1 = new JButton("green");
        btn1.setBounds(100, 60, 90, 30);
//        btn1.setBackground(Color.pink);
//        btn1.setForeground(Color.red);
        //btn1.setFont(f1);
        c.add(btn1);
        
        btn2 = new JButton("black");
        btn2.setBounds(100, 100, 90, 30);
//        btn2.setBackground(Color.pink);
        btn2.setForeground(Color.red);
        //btn1.setFont(f1);
        c.add(btn2);
        
        btn3 = new JButton("pink");
        btn3.setBounds(100, 140, 90, 30);
//        btn3.setBackground(Color.pink);
//        btn3.setForeground(Color.DARK_GRAY);
        //btn1.setFont(f1);
        c.add(btn3);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == btn1)
            btn1.setBackground(Color.green);
        else if(e.getSource() == btn2)
            btn2.setBackground(Color.black);
        if(e.getSource() == btn3)
            btn3.setBackground(Color.pink);
        
    }
    
    public static void main(String[] args) {
        
        AddListener_anotherMathod frame = new AddListener_anotherMathod();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(AddListener_anotherMathod.DISPOSE_ON_CLOSE);
        frame.setTitle("JCheck Box Demo");
                        
    }
       
}
