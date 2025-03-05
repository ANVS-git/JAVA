
import java.util.Arrays;

public class Equal_arrays {
    public static void main(String [] args ){
        int [] arr1={1,2,3}; 
        int [] arr2={1,2,3}; 
        int a=0;

        System.out.println(Arrays.equals(arr1,arr2));

        for(int i=0;i<arr1.length;i++){
            if(arr2[i]!=arr1[i]){
                a=1;
                System.out.println("Arrays are not equal.");
                break;
            }
        }
        if(a==0){
            System.out.println("Arrays are equal.");
        }
    }
}
