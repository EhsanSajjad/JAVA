
package jframedemo;

import javax.swing.JOptionPane;


public class ShowConfirmDia {
    public static void main(String[] args) {
        
       int choise = JOptionPane.showConfirmDialog(null, "Are you sure?", "quit", JOptionPane.YES_NO_CANCEL_OPTION, 2);
       
       if(choise == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
       else
       {
           System.out.println("You clicked on 'No' button");
       }
        
    }
    
}
