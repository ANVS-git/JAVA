import java.util.Scanner;

public class userinput {
    public static void main( String [] args){
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter name: "); 
        String s=sc.nextLine(); 
        System.out.println(s);
    }
}
