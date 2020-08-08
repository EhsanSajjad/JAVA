
package array1;

public class Array1 {

    
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        System.out.println(a[0]+"\t"+a[4]);
        System.out.println("-------------------");
       
        
        for(int temp :a){
            System.out.println("    "+temp);
        }
        System.out.println("-------------------");
        
        
        
        int[] x = new int[5];
        x[1]=33;
        x[4]=55;
        for(int temp2 : x){
            System.out.println(temp2);
        }
        System.out.println("-------------------");
        
        
        
        String[] sta = {"one", "two", "three"};
        System.out.println(sta[2]+"\n----");
        for(String temp3 : sta)
        {
            System.out.println(temp3);
        }
        System.out.println("-------------------");
        
        
        
        String[] stx = new String[5];
        stx[1] = "Sajjad";
        stx[3] = "21";
        for(String temp4 : stx){
            System.out.println(temp4);
        }
        System.out.println("-------------------");
        
        
        
 
    }       
    
}
