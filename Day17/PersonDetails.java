import java.util.Scanner;
class Person{
  int age;
  String name;
  String address="Karnataka";

  Person(int a,String n){
    name=n;
    age=a;
  }
  void display(){
    System.out.println(name+" "+age+" "+address);
  }
}

class PersonDetails{

  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    Person p=new Person(s.nextInt(),s.next());
    p.display();
  }
}