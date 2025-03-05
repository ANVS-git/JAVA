public class Fibbonacci {

    public static int fib(int n){
        if(n<=1){
            return 1;
        }
        else {
            return fib(n-1)+fib(n-2); 
        }
    }
    public static void main (String [] args){
            //   System.out.println(fib(1));
              for(int i=1;i<=20;i++){
                System.out.println(fib(i)+" ");
              }
    }
}
