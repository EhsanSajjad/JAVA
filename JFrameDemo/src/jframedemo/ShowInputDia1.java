
package jframedemo;

import javax.swing.JOptionPane;

public class ShowInputDia1 {
    
    public static void main(String[] args) { 
        
        String name1 = JOptionPane.showInputDialog( "Your name : ", "Sajjad");
        String name2 = JOptionPane.showInputDialog( "Student ID number : ", "188801018");
        int digit = Integer.parseInt(name2);
        
        JOptionPane.showMessageDialog(null, name1+", your student ID number is "+digit);
        
    }
    
}
