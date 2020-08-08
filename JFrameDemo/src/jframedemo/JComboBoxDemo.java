
package jframedemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class JComboBoxDemo extends JFrame{
    
    private Container c;
    private JComboBox cb;
    private String[] proLang = {"C", "C++", "C#", "JAVA", "Java Script", "Python", "Rubi"}; 
    private JLabel L1;
    
    JComboBoxDemo()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        this.setBounds(400, 200, 420, 350);
        
        L1 = new JLabel();
        L1.setBounds(90, 130, 200, 30);
        c.add(L1);
        
        cb = new JComboBox(proLang);
        cb.setBounds(90, 90, 120, 30);
        cb.setEditable(true);
        cb.setSelectedIndex(3);
        //cb.setSelectedItem("JAVA");
        cb.addItem("Fortran");  
        cb.removeItemAt(2);
        //cb.removeItem("C#");
        //cb.removeAllItems(); 
        c.add(cb);
        
        cb.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                String s = cb.getSelectedItem().toString();
                
                L1.setText("You have selected "+s);
            }
        });
        
        System.out.println("Total Index Number : "+cb.getItemCount());
                
    }
    
    public static void main(String[] args) {
        
        JComboBoxDemo frame = new JComboBoxDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JComboBoxDemo.DISPOSE_ON_CLOSE);
        frame.setTitle("JCheck Box Demo");
        
    }
    
}
