public class Encapsulation{
    private String name;

    public Encapsulation(String name) {
           this.name=name; 
    }

    public void setName(String name){
          this.name=name;
    }

    public String getName(){
        return name;
    }
    public static void main(String [] args){
        Encapsulation Student1=new Encapsulation("vasu"); 
        System.out.println(Student1.getName());
        Student1.setName("sekhar");
        System.out.println(Student1.getName());
    }
}