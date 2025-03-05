import java.util.*; 

public class Calories {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in); 
        String str=scanner.nextLine();
        int duration=scanner.nextInt();
        
        switch(str){
           case "Running": 
              System.out.println("Calories Burned: "+duration*10);
              break;
           case "swimming": 
              System.out.println("Calories Burned: "+duration*9.8);
              break;
           case "cycling": 
              System.out.println("Calories Burned: "+duration*8);
              break;
           case "yoga": 
              System.out.println("Calories Burned: "+duration*2.5);
              break;
        
    }
    scanner.close(); 
    }
}
