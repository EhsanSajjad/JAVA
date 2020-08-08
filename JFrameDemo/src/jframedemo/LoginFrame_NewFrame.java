
package jframedemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class LoginFrame_NewFrame extends JFrame {
    
    private Container c;
    private JLabel L1, L2;
    private Font f1;
    private JButton btn1, btn2, btn3;
    private JTextArea ta;
    private JScrollPane Scroll;
    
    LoginFrame_NewFrame()
    {                
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        this.setBounds(400, 200, 420, 350);
        
        f1 = new Font("Arial", Font.BOLD, 18);
        
        L1 = new JLabel("Hello Everyone. This is the new page.");
        L1.setBounds(30, 25, 400, 30);
        //L1.setOpaque(true);
       // L1.setBackground(Color.DARK_GRAY);
        L1.setForeground(Color.BLUE);
        L1.setFont(f1);
        c.add(L1);
        
        L2 = new JLabel(" Bio : ");
        L2.setBounds(30, 70, 55, 24);
        L2.setOpaque(true);
        L2.setBackground(Color.GRAY);
        L2.setForeground(Color.black);
        L2.setFont(f1);
        c.add(L2);
        
        ta = new JTextArea("Write down your bio..."); 
        ta.setOpaque(true);
        ta.setBackground(Color.LIGHT_GRAY);
//        ta.setBounds(30, 110, 300, 100);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
//        c.add(ta);        
        Scroll = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        Scroll.setBounds(30, 110, 300, 100);
        c.add(Scroll);
        
        btn1 = new JButton("Exit");
        btn1.setBounds(330, 280, 60, 20);
        btn1.setBackground(Color.pink);
        btn1.setForeground(Color.red);
        //btn1.setFont(f1);
        c.add(btn1);
        
        btn2 = new JButton("Next");
        btn2.setBounds(265, 280, 60, 20);
        btn2.setBackground(Color.pink);
        btn2.setForeground(Color.black);
        //btn1.setFont(f1);
        c.add(btn2);
        
        btn3 = new JButton("Back");
        btn3.setBounds(195, 280, 65, 20);
        btn3.setBackground(Color.pink);
        btn3.setForeground(Color.DARK_GRAY);
        //btn1.setFont(f1);
        c.add(btn3);
        
        btn1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                
                dispose();
            }

        });
        
        btn2.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                LoginFrame_JRadioButton frame = new LoginFrame_JRadioButton(); 
                frame.setVisible(true);
            }
        });
        
        btn3.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                LoginFrameDemo frame = new LoginFrameDemo();
                frame.setVisible(true);
            }
        });

                
    }
    
    public static void main(String[] args) {
        
        LoginFrame_NewFrame frame = new LoginFrame_NewFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(LoginFrame_NewFrame.DISPOSE_ON_CLOSE);
        frame.setTitle("New Login Page");
        
    }
    
}
