
package primenumner;

import java.util.Scanner;


public class PrimeNumner {

   
    public static void main(String[] args) {
        
        int m, n, count = 0, totalPrime = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial number : ");
        m = input.nextInt();
        
        System.out.print("Enter final number : ");
        n = input.nextInt();
        
        for (int i = m; i <= n; i++) 
        {
            for (int j = 2; j < i; j++) 
            {                
                if (i % j == 0) 
                {
                    count++;
                    break;                
                }  
                              
            } 
            if (count == 0) 
                {
                    totalPrime++;
                    System.out.println("prime "+i);
                } 
            else
            {
                System.out.println("not prime "+i);
            }            
            count = 0;                
        }
        System.out.println("\nTotal prime number : "+totalPrime);
        System.out.println("");
        
        
    }
    
}
