import java.util.Scanner;
class Cicle{
  int radius,diameter;

  Cicle(int r){
    radius=r;
    diameter=2*r;
  }
  void area()
  {
    System.out.println("The diameter of the circle is "+diameter);
    double area=3.14*radius*radius;
    System.out.println("Area of the circle is:"+area);
  }
}
class Circle{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the radius of the circle");
    Cicle r=new Cicle(sc.nextInt());
    r.area();
 }
}