class Vehicle{
  String make, model;
}
class Car extends Vehicle{
  int nodoors;
}
class SportsCar extends Car{
  double topSpeed;
  void revengine(){
    System.out.println("Make: "+make);
    System.out.println("Mode: "+model);
    System.out.println("No of doors are: "+nodoors);
    System.out.println("Top Speed is: "+topSpeed);
    System.out.println("Vroom!");
  }
}
class Vehicle2Demo{
  public static void main(String args[]){
    SportsCar obj = new SportsCar();
    obj.make = "BMW";
    obj.model = "X3";
    obj.nodoors = 4;
    obj.topSpeed = 300.00f;
    obj.revengine();
    
  }
}