
package second_semistr_exm_q;

import java.util.Scanner;

public class FindMaximumNumber {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a, b, c, max;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        max = a;
        if(b>max)
            max = b;
        if(c>max)
            max = c;
        System.out.println("\nthe maximum number : "+max);
        
    }
    
}
