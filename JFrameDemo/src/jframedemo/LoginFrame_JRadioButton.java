
package jframedemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class LoginFrame_JRadioButton extends JFrame {
    
    private Container c;
    private JRadioButton male, female, other;
    private ButtonGroup grp;
    private JButton btn1, btn2, btn3;
    
    
    LoginFrame_JRadioButton()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        this.setBounds(400, 200, 420, 350);
        
//        container e radioButton add korar age ButtonGroup banate hobe.
        
        grp = new ButtonGroup();        

        male = new JRadioButton("Male", true);
//        male.setSelected(true);
        male.setBackground(Color.orange);
        male.setBounds(50, 50, 60, 20);        
        c.add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(120, 50, 70, 20);
        female.setBackground(Color.orange);
        c.add(female);
        
        other = new JRadioButton("Others");
        other.setBackground(Color.orange);
        other.setBounds(200, 50, 80, 20);
        other.setEnabled(false);
        c.add(other);
        
//        container e add korar por radioButton grouping korte hobe.. tai add korar pore likhte hobe
        
        grp.add(male);
        grp.add(female);
        grp.add(other);
        
        btn1 = new JButton("Back");
        btn1.setBounds(195, 280, 65, 20);
        btn1.setBackground(Color.pink);
        btn1.setForeground(Color.DARK_GRAY);
        //btn1.setFont(f1);
        c.add(btn1);
        
        btn2 = new JButton("Next");
        btn2.setBounds(265, 280, 60, 20);
        btn2.setBackground(Color.pink);
        btn2.setForeground(Color.black);
        //btn1.setFont(f1);
        c.add(btn2);
        
        btn3 = new JButton("Exit");
        btn3.setBounds(330, 280, 60, 20);
        btn3.setBackground(Color.pink);
        btn3.setForeground(Color.red);
        //btn1.setFont(f1);
        c.add(btn3);
        
        btn1.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                LoginFrame_NewFrame frame = new LoginFrame_NewFrame();
                frame.setVisible(true);
            }
        });
        
        btn2.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                JCheckBoxDemo frame = new JCheckBoxDemo();
                frame.setVisible(true);
            }
        });
        
        
        btn3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                
                dispose();
            }

        });
    }
    
    public static void main(String[] args) {
        
        LoginFrame_JRadioButton frame = new LoginFrame_JRadioButton();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(LoginFrame_JRadioButton.DISPOSE_ON_CLOSE);
        frame.setTitle("JRadio Button Demo");
    }
    
}
