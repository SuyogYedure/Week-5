class Vehicle{
  String make, model;
  int year;
}
class Car extends Vehicle{
  String color;
  int nodoors;

  void getinfo(){
    System.out.println(make+" "+model+" "+color+" "+nodoors+" "+year);
  }
}
class VehicleDemo{
  public static void main(String args[]){
    Car obj = new Car();
    obj.make = "BMW";
    obj.model = "X3";
    obj.color = "black";
    obj.nodoors = 4;
    obj.year = 2023;
    obj.getinfo();
  }
}