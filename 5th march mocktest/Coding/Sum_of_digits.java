import java.util.Scanner;

public class Sum_of_digits {

    public static int sum(int n){
        if(n==0)
          return 0; 
        return n%10+sum(n/10); 
    }
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the number: ");
        int num=sc.nextInt(); 
        System.out.println("Sum of digits is : "+sum(num));

    }
}
