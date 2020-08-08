
package arithmaticoperator;
import java.util.Scanner;

public class ArithmaticOperator {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, result;
        System.out.println("Enter two numbers : ");        
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        result = num1 + num2;
        System.out.println("Summation is "+result);
        
        result = num1 - num2;
        System.out.println("Substruction is "+result);
        
        result = num1 * num2;
        System.out.println("Multiplication is "+result);
        
        result = num1 / num2;
        System.out.println("Division is "+result);
        
        result = num1 % num2;
        System.out.println("Reminder is "+result);
        
        double result2 = num1 /(double) num2;     
       // evabe '(double)' likhe 'int' data type k 'double' data type e neya jay.. etake type casting bole
        System.out.println("Division(in fraction) is "+result2);
    }
    
}
