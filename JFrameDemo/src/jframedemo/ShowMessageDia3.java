
package jframedemo;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ShowMessageDia3 {
    
    public static void main(String[] args) {
        
        ImageIcon icon = new ImageIcon("overseas.jpg");
        JOptionPane.showMessageDialog(null, "thank you", "News", JOptionPane.PLAIN_MESSAGE, icon);
        
    }
    
}
