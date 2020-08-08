package jframedemo;

import javax.swing.JOptionPane;

public class ShowMessagedia {
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello");
        
        String Name=JOptionPane.showInputDialog(null, "Enter Age: ");
        int digit= Integer.parseInt(Name);
        JOptionPane.showMessageDialog(null, "Your name "+digit);
                
    }
    
}
