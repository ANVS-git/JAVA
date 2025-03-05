import java.util.Scanner; 

public class predict_temp {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.err.print("Enter temperature: "); 
        float temperature=scanner.nextFloat(); 
        if(temperature>30){
            System.out.println("Hot");
        }
        else if(temperature>=20 && temperature<=30){
            System.out.println("Warm");
        }
        else if(temperature>=10 && temperature<20){
            System.out.println("Moderate");
        }
        else{
            System.out.println("Cold");
        }
        scanner.close();
    }
}
