import java.util.Scanner; 

public class pattern2 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the number of items in last line: ");
        int n=sc.nextInt(); 
        int gaps=n/2,odd=1,num=1;
    
        while(gaps>=0){
            for(int i=0;i<gaps;i++){
                System.out.print(" ");
            }
            for(int i=0;i<odd;i++){
                 System.out.print(num+" ");
                 num++;
            }
            System.out.println();
            odd=odd+2;
            gaps--; 
        }
    }
}
