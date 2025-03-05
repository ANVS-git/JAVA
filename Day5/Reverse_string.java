import java.util.Scanner;

public class Reverse_string {

    public static String reverse(String s){
        if(s.isEmpty()){
            return s;
        }
        return reverse(s.substring(1))+s.charAt(0); 
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        String rev_str=reverse(str); 
        System.out.println("Reversed string is: "+rev_str);
    }
}
