public class work2 {
    String title;
    String author;
    double price;
    
public work2(String title,String author,double price){
    this.title=title;
    this.author=author;
    this.price=price;

 }
 //copy constructor
public work2(work2 otherBook){
    this.title=otherBook.title;
    this.author=otherBook.author;
    this.price=otherBook.price;
}
public void display(){
    System.out.println(title);
    System.out.println(author);
    System.out.println(price);
    System.out.println();
}
public static void main(String[] args){
    work2 originalWork2=new work2("sam book","sam",10000);
    work2 copiedWork2=new work2(originalWork2);
    // Display original book details
    System.out.println("Original Book Details:");
    originalWork2.display();

    // Display copied book details
    System.out.println("Copied Book Details:");
    copiedWork2.display();

}    
   
}