

public class Add_Matrices {

    public static void main(String [] args){
        int arr1 [][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr2 [][]={{1,2,3},{4,5,6},{7,8,9}};
        int rows=arr1.length; 
        int cols=arr1[0].length; 

        int arr3[][]=new int[rows][cols]; 

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                 arr3[i][j]=arr1[i][j]+arr2[i][j]; 
            }
        }
        
        for (int i=0;i<rows;i++){
                  for(int j=0;j<cols;j++){
                      System.out.print(arr3[i][j]+" ");
                  }
                  System.out.println();
        }
    }
}