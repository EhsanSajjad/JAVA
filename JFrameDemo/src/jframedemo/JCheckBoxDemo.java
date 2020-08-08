
package jframedemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JCheckBoxDemo extends JFrame{
    
    private Container c;
    private JCheckBox box1, box2, box3;
    private ButtonGroup grp;
    private JLabel lvl;
    
    JCheckBoxDemo()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        this.setBounds(400, 200, 420, 350);
        
        lvl = new JLabel("");
        lvl.setBounds(70, 200, 200, 30);
        c.add(lvl);
        
        
        
        grp = new ButtonGroup();      
        
        box1 = new JCheckBox("WeChat");
        box1.setBounds(100, 80, 100, 30);
        c.add(box1);
        
        box2 = new JCheckBox("Alipay");
        box2.setBounds(100, 120, 100, 30);
        c.add(box2);
        
        box3 = new JCheckBox("Bank Card", true);
//        box3.setSelected(true);
        box3.setBounds(100, 160, 100, 30);
        c.add(box3);
        
        grp.add(box1);
        grp.add(box2);
        grp.add(box3);
        
        Handler handler = new Handler();
        box1.addActionListener(handler);
        box2.addActionListener(handler);
        box3.addActionListener(handler);
        
    }
    
    class Handler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(box1.isSelected())
                lvl.setText("You have selected WeChat");
            else if (box2.isSelected())
                lvl.setText("You have selecteded Alipay");
            else 
                lvl.setText("You have selected Bank card");
            
//            or......
                
//            if(e.getSource()==box1)
//                lvl.setText("You have selected WeChat");
//            else if (e.getSource()==box2)
//                lvl.setText("You have selecteded Alipay");
//            else 
//                lvl.setText("You have selected Bank card");
                
        }
    }
    
    public static void main(String[] args) {
               
        JCheckBoxDemo frame = new JCheckBoxDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JCheckBoxDemo.DISPOSE_ON_CLOSE);
        frame.setTitle("JCheck Box Demo");
        
    }
    
}
