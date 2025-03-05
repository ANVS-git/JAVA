import java.util.Scanner; 

public class Atm_pin {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in); 
        System.out.print("Actual Password: ");
        String pass=sc.nextLine(); 
        String guess;
        int count=0; 
        
        do { 
            System.out.print("Guess the password:");
            guess=sc.nextLine(); 
            count++; 
            
            if(pass.equals(guess)){
                System.out.println("Guess corret! Logged in Successfully");
                break;
            }
            else{
                System.out.println("Guess Incorrect! You have "+(3-count)+ " attempts left. ");
            }
        } while (count<3);
        
       if(count>=3){
        System.out.println("Account locked!");
       }
        sc.close(); 
    }
}
