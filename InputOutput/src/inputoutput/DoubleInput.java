
package inputoutput;

import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        double d;
        System.out.println("Enter any double Number : ");
        d = input.nextDouble();
        System.out.println("The number is "+d);
    }
    
}
