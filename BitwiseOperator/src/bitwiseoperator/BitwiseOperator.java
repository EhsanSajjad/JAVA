package bitwiseoperator;

import java.util.Scanner;

public class BitwiseOperator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int x, y, res1, res2, res3;
        x = input.nextInt();
        y = input.nextInt();
        
        res1 = x & y;  // & = bitwise AND
        System.out.println("binary multiplication : (x & y = "+res1+")");
        
        res2 = x | y;  // | = bitwise OR
        System.out.println("binary add : (x | y = "+res2+")");
        
        res3 = x ^ y;  // ^ = bitwise XOR
        System.out.println("XOR : (x ^ y = "+res3+")");
        
        System.out.println("................");
        
         
        int xx, yy, i, result1, result2;
        System.out.println("Enter two numbers. I will show you the right shifter and left shifter : ");
        xx = input.nextInt();
        yy = input.nextInt();
        System.out.print("Enter how many times you want to shift : ");
        i = input.nextInt();
        result1 = xx >> i;
        result2 = yy << i;
        System.out.println("right shifter : "+result1);
        System.out.println("left shifter : "+result2);
        
        
    }
    
}
