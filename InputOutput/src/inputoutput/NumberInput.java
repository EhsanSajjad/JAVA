
package inputoutput;
import java.util.Scanner;

public class NumberInput {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int x;
        x = input.nextInt();
        System.out.println("The numer is "+x);
    }
    
}
