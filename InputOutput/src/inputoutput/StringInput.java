
package inputoutput;

import java.util.Scanner;
public class StringInput {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        String str;
        System.out.println("Enter your name ");
        str = input.nextLine();
        System.out.println("Your name is "+str);
        
    }
    
}
