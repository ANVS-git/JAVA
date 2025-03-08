class Animal{
    protected String name; 
   
    public void AnimalSound(){
        System.out.println("The Animal Sound.");
    }
}

class Dog extends Animal {
    public void AnimalSound(){
        System.out.println("The dog sounds: bow bow.");
    }
}

class Cat extends Animal{
    public void AnimalSound(){
        System.out.println("The cat sounds: meow meow.");
    }
}

public class Polymorphism {
        
        public static void main(String [] args){
            Animal myAnimal=new Animal();
            Animal myDog=new Dog();  
            Cat myCat=new Cat();
            myAnimal.AnimalSound();
            myDog.AnimalSound();
            myCat.AnimalSound();
    
        }
    }
