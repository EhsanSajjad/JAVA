
package jframedemo;

import javax.swing.JOptionPane;

public class ShowInputDia2 {
    public static void main(String[] args) {
        
        String f_name = JOptionPane.showInputDialog(null, "Enter your first name : ", "Write down your name", JOptionPane.QUESTION_MESSAGE);
        String l_name = JOptionPane.showInputDialog(null, "Enter your last name : ", "Write down your name", JOptionPane.QUESTION_MESSAGE);
        String name = f_name + " " + l_name;
        
        JOptionPane.showMessageDialog(null, "Your full name is : "+name, "Full Name", 1);
              
    }
    
}
