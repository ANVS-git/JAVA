abstract class Animal {
    public void sleep(){
        System.out.println("ZZZZZ");
    }

    public abstract void animalSound(); 
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
}

public class Abstraction {
    public static void main(String [] args){
        Pig myPig=new Pig(); 
        myPig.animalSound();
    }
}
  