import java.util.Scanner; 

public class Grade {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in); 
        System.out.println("Enter the marks obtained: ");
        int marks=scanner.nextInt(); 
        
        switch(marks/10){
            case 10: 
            case 9: 
                System.out.println("Grade A");
                break;  
            case 8: 
               System.out.println("Grade B");
               break; 
            case 7: 
               System.out.println("Grade C");
               break;
            case 6: 
               System.out.println("Grade D");
               break; 
            default: 
               System.out.println("Fail");
               break;
        }
        scanner.close();
    }
}