import java.util.Scanner; 

public class Arithmetic_operators {
    public static void main(String []args){
           Scanner scanner=new Scanner(System.in); 
           System.out.println("---Arithmetic operators---");

           int a=scanner.nextInt(); 
           int b=scanner.nextInt(); 

           System.out.println("a+b="+(a+b));
           System.out.println("a-b="+(a-b));
           System.out.println("a*b="+ (a*b));
           System.out.println("a/b="+(a/b));
           System.out.println("a%b="+(a%b));
           a++;
           b--;
           System.out.println("a="+a);
           System.out.println("b="+b);




           System.out.println("---Assignment operators---");
           a+=10; 
           b-=2; 
           System.out.println(a+ " "+ b);

           System.out.println("---comparison operators---");
           if(a==b)
               System.out.println("a and b are equal.");
           else if(a>b)
               System.out.println("a is greater than b"); 
           else
               System.out.println("a is less than b"); 




         System.out.println("---logical operators---");
        int c=20,d=30;
        if(c<25 && d>25){
            System.out.println("Good"); 
        }
        if(c>=15 || d<20){
            System.out.println("Bad");
        }
        




        System.out.println("---Bitwise operators---"); 
        a=1; 
        b=2;
        System.out.println(a&b); 
        System.out.println(a|b); 
        System.out.println(~a); 
        System.out.println(a^b);

        scanner.close(); 

    }
}
