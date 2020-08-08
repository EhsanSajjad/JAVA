package variable;

public class VariableFormatSpecifier {
    
    public static void main(String[] args){
        boolean b = true;
        int i = 317;
        char c = 'a';
        short s = 43;
        float f = 12.5f;
        double d = 12.4;
        
        System.out.printf("b = %b",b);
        System.out.printf("i = %d",i);
        System.out.printf("c = %c",c);
        System.out.printf("s = %d",s);
        System.out.printf("f = %.2f",f);
        System.out.printf("d = %.3f",d);
    }
    
}
