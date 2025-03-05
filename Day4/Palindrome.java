import java.util.Scanner; 

public class Palindrome {
    public static void main (String []args){
        Scanner sc =new Scanner(System.in); 
        System.out.print("Enter a string:"); 
        String s=sc.nextLine(); 
        String reversed_s=""; 
        for(int i=0;i<s.length();i++){
            reversed_s=s.charAt(i)+reversed_s; 
        }
        if(s.equals(reversed_s)){
              System.out.println( "String is a palindrome."); 
        }
        else{
            System.out.println("String is not a palindrome."); 
        }

        System.out.println("Enter a number: "); 
        int n=sc.nextInt(); 
        int reversed_n=0,t=n;
        while(n>0){
            reversed_n*=10;
            reversed_n+=(n%10);
            n=n/10;
        }
        if(reversed_n==t){
            System.out.println("Given number is a palindrome"); 
        }
        else{
            System.out.println("Given number is not a palindrome"); 
        }
    }
}
