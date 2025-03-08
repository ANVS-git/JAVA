public class Constructors {
    int age; 
    String name; 

    //default constructor
    Constructors(){
        name="vasu"; 
        age=22; 
    }

    // parameterized constructor
    Constructors(int age,String name){
        this.name=name; 
        this.age=age;
    }

    public void print(){
        System.out.println(name+" is "+age+" years old.");
    }

    public static void main(String [] args){
        Constructors myObj=new Constructors(); 
        Constructors myObj1=new Constructors(18,"sekhar");
        myObj.print(); 
        myObj1.print();
    }
}
