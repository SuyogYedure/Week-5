import java.util.Scanner;
class Book{
  Scanner s = new Scanner(System.in);
  String name,title;
  int year;

  Book(String title,String name,int year){
    this.title = title;
    this.name = name;
    this.year = year;
}
  void display(){
    System.out.println("Title is :" +title);
    System.out.println("Name is :" +name);
    System.out.println("Year is :" +year);
  }
}
public class Books{
  public static void main(String args[]){
    Book book = new Book("Game of Thrones", "RR Martin", 1996);
    book.display();
  }
}