public class Task1 {
    String name; 
    int rollnum; 
    char grade; 

    Task1(String s,int roll,char gr){
          name=s; 
          rollnum=roll; 
          grade=gr;
    }

    void Print_details(){
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+rollnum);
        System.out.println("Grade: "+grade);
    }

    public static void main(String [] args){
          Task1 Student1=new Task1("Ramya",156,'A'); 
          Student1.Print_details();
    }
}
