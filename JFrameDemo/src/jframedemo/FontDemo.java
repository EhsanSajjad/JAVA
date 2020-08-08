package jframedemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FontDemo extends JFrame {

    private Container c;
    private JLabel L1, L2;
    private Font f;

    FontDemo() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);

        f = new Font("Arial", Font.BOLD, 20);

        L1 = new JLabel(" PASSPORT NAME : ");
        L1.setBounds(50, 30, 300, 50);
        L1.setFont(f);
        L1.setForeground(Color.RED);
        /* font er background color change korte hole 'setOpaque(true)' eta true kore dite hobe.cz by default eta false kora thake */
        L1.setOpaque(true);
        L1.setBackground(Color.yellow);
        c.add(L1);

        L2 = new JLabel(" PASSPORT NUMBER : ");
        L2.setBounds(50, 95, 300, 50);
        L2.setFont(f);
        L2.setForeground(Color.pink);
        L2.setOpaque(true);
        /* font er background color change korte hole 'setOpaque(true)' eta true kore dite hobe.cz by default eta false kora thake */
        L2.setBackground(Color.gray);
        c.add(L2);

    }

    public static void main(String[] args) {

        FontDemo frame = new FontDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("New Title");
        frame.setBounds(900, 100, 450, 400);
    }
}
