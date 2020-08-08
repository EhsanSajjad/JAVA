
package jframedemo;

import javax.swing.JOptionPane;

public class ShowMessageDia2 {
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Wanna try?", "Report", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "X-men?", "Warning", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Click the button", "Step", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "It may demage your computer" ,"Warning", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Are you sure?", "Window", JOptionPane.INFORMATION_MESSAGE);
        
        // icon er code na likhe number diyeu icon deya jay....niche demo deya holo..        
        
        JOptionPane.showMessageDialog(null, "Wanna try?", "Report", 0);
        JOptionPane.showMessageDialog(null, "X-men?", "Warning", 3);
        JOptionPane.showMessageDialog(null, "Click the button", "Step", -1);
        JOptionPane.showMessageDialog(null, "It may demage your computer" ,"Warning", 2);
        JOptionPane.showMessageDialog(null, "Are you sure?", "Window", 1);
                
    }
    
}
