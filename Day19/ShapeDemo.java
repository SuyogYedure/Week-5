class Shape{
  String color,filled;
}
class Rectangle extends Shape{
  double width,height;

  double getArea(){
    double area = width*height;
    return area;
  }
}
class ShapeDemo{
  public static void main(String args[]){
    Rectangle obj = new Rectangle();
    obj.color = "red";
    obj.filled = "Yes";
    obj.height = 10;
    obj.width = 5;
    double area = obj.getArea();
    System.out.println("Area is: "+area);
  }
}