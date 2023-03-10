import java.util.Scanner;
class Car{
  String make;
  int year, model;

  Car(int y, int b, String m){
    year = y;
    model = b;
    make = m;
  }
  void display(){
    System.out.println(year+" "+make+" "+model);
  }
}
class CarDemo{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    Car c = new Car(s.nextInt(),s.nextInt(),s.next());
    c.display();
  }
}