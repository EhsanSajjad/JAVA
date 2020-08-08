package jframedemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JTextFieldDemo extends JFrame {

    private Font f;
    private Container c;
    private JLabel L1, L2;
    private JTextField tf1, tf2;
    private JPasswordField pf;
    private JButton btn1, btn2, btn3;
    private Cursor cur1, cur2;
    private ImageIcon img;

    JTextFieldDemo() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);

        f = new Font("Arial", Font.BOLD + Font.ITALIC, 14);
        
        cur1 = new Cursor(Cursor.HAND_CURSOR);
        cur2 = new Cursor(Cursor.WAIT_CURSOR);
        
        img = new ImageIcon(getClass().getResource("overseas.jpg"));

        L1 = new JLabel(" Enter your Name : ");
        L1.setBounds(20, 50, 158, 20);
        L1.setFont(f);
        L1.setForeground(Color.GREEN);
        L1.setOpaque(true);
        L1.setBackground(Color.DARK_GRAY);
        c.add(L1);

        L2 = new JLabel(" Enter your Password : ");
        L2.setBounds(20, 100, 158, 20);
        L2.setFont(f);
        L2.setForeground(Color.GREEN);
        L2.setOpaque(true);
        L2.setBackground(Color.DARK_GRAY);
        c.add(L2);

        tf1 = new JTextField(" Your Nmae");
        tf1.setBounds(182, 50, 240, 20);
        tf1.setForeground(Color.red);
        tf1.setBackground(Color.LIGHT_GRAY);
        tf1.setFont(f);
        c.add(tf1);

        pf = new JPasswordField();
        pf.setBounds(182, 100, 240, 20);
        pf.setEchoChar('#');
        pf.setBackground(Color.LIGHT_GRAY);
        pf.setForeground(Color.red);
        pf.setFont(f);
        c.add(pf);

//        tf2 = new JTextField(" Password");
//        tf2.setBounds(182, 100, 240, 20);
//        tf2.setFont(f);
//        tf2.setForeground(Color.RED);
//        tf2.setBackground(Color.LIGHT_GRAY);
//        c.add(tf2);
        // Action Litener er kaj suru nich theke....
        tf1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String s = tf1.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter your Name.", "Error!!", 0);
                } else {
                    JOptionPane.showMessageDialog(null, "Done!", "Welcome", 1);
                }
            }
        });

        pf.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String s = pf.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter the Password", "Error!!", 0);
                } else {
                    JOptionPane.showMessageDialog(null, "Congratulations!", "Welcome", 1);
                }
            }
        });

        btn1 = new JButton("Login");
        btn1.setBounds(310, 320, 95, 22);
        btn1.setForeground(Color.DARK_GRAY);
        btn1.setBackground(Color.green);
        btn1.setFont(f);
        btn1.setCursor(cur1);
        c.add(btn1);
        
        btn2 = new JButton("Clear");
        btn2.setBounds(420, 320, 90, 22);
        btn2.setForeground(Color.DARK_GRAY);
        btn2.setBackground(Color.pink);
        btn2.setFont(f);
        btn2.setCursor(cur1);
        c.add(btn2);
        
        btn3 = new JButton(img);
        btn3.setBounds(310, 234, 200, 70);
        btn3.setCursor(cur2);
        c.add(btn3);
        
       btn2.addActionListener(new ActionListener() {
           
           public void actionPerformed(ActionEvent e)
           {
               tf1.setText("");
               pf.setText("");
           }
           
       });
              
    }

    public static void main(String[] args) {

        JTextFieldDemo frame = new JTextFieldDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JTextFieldDemo.EXIT_ON_CLOSE);
        frame.setBounds(750, 120, 550, 400);
        frame.setTitle("JText Field Demo");
        //frame.setResizable(false);
    }

}
