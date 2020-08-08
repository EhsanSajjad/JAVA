package jframedemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrameDemo extends JFrame {

    private Container c;
    private JLabel headLine, nameLine, passLine;
    private Font f1, f2, f3;
    private JPasswordField pf;
    private JTextField nameTxtFld;
    private JButton btn1, btn2, btn3;

    LoginFrameDemo() {
        this.setDefaultCloseOperation(LoginFrameDemo.DISPOSE_ON_CLOSE);
        this.setBounds(835, 110, 510, 420);
        this.setTitle("Login Page Demo");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.black);

        f1 = new Font("Arial", Font.BOLD, 25);
        f2 = new Font("Arial", Font.BOLD, 17);
        f3 = new Font("Arial", Font.PLAIN, 17);

        headLine = new JLabel(" Welcome to Login Page");
        headLine.setBounds(100, 20, 290, 40);
//        headLine.setOpaque(true);
//        headLine.setBackground(Color.DARK_GRAY);
        headLine.setForeground(Color.GREEN);
        headLine.setFont(f1);
        c.add(headLine);

        nameLine = new JLabel(" ID Name : ");
        nameLine.setBounds(30, 100, 105, 25);
        nameLine.setOpaque(true);
        nameLine.setBackground(Color.DARK_GRAY);
        nameLine.setForeground(Color.white);
        nameLine.setFont(f2);
        c.add(nameLine);

        passLine = new JLabel(" Password : ");
        passLine.setBounds(30, 130, 105, 25);
        passLine.setOpaque(true);
        passLine.setBackground(Color.DARK_GRAY);
        passLine.setForeground(Color.white);
        passLine.setFont(f2);
        c.add(passLine);

        nameTxtFld = new JTextField();
        nameTxtFld.setBounds(140, 100, 230, 25);
        nameTxtFld.setOpaque(true);
        nameTxtFld.setBackground(Color.DARK_GRAY);
        nameTxtFld.setForeground(Color.white);
        nameTxtFld.setFont(f3);
        c.add(nameTxtFld);

        pf = new JPasswordField();
        pf.setBounds(140, 130, 230, 25);
        pf.setOpaque(true);
        pf.setBackground(Color.DARK_GRAY);
        pf.setForeground(Color.white);
        pf.setFont(f3);
        pf.setEchoChar('^');
        c.add(pf);

        btn1 = new JButton("Login");
        btn1.setBounds(5, 165, 480, 23);
        btn1.setBackground(Color.GRAY);
        btn1.setForeground(Color.BLACK);
        btn1.setFont(f2);
        c.add(btn1);

        btn2 = new JButton("Exit");
        btn2.setBounds(400, 340, 65, 23);
        btn2.setBackground(Color.green);
        btn2.setForeground(Color.BLACK);
        //btn1.setFont(f3);
        c.add(btn2);

        btn3 = new JButton("Clear");
        btn3.setBounds(20, 340, 65, 23);
        btn3.setBackground(Color.green);
        btn3.setForeground(Color.BLACK);
        //btn1.setFont(f3);
        c.add(btn3);

        btn3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                nameTxtFld.setText("");
                pf.setText("");
            }

        });

        btn1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String name = nameTxtFld.getText();
                String password = pf.getText();

                if (name.equals("Sajjad") && password.equals("123")) {
                    JOptionPane.showMessageDialog(null, "You are succesfully Loged in", "Wlcome", 1);
                    dispose();
                    LoginFrame_NewFrame frame = new LoginFrame_NewFrame();
                    frame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Enter your Name and Password Correctly", "Error!!", 0);
                }
            }

        });

        btn2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                
                dispose();
            }

        });

    }

    public static void main(String[] args) {

        LoginFrameDemo frame = new LoginFrameDemo();
        frame.setVisible(true);
    }

}
