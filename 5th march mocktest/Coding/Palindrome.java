import java.util.Scanner; 

public class Palindrome {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter the string: ");
        String s=sc.nextLine(); 
        String rev_str="";
        for (int i=0;i<s.length();i++){
             rev_str=s.charAt(i)+rev_str; 
        }

        System.out.println("Reversed string: "+rev_str);
    }
}
