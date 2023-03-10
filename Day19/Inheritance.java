class Animal {
  String name;
  String color;
  int tailLength;
  int nooflegs;
  void eat() {
    System.out.println("eating");
  }
}
class Dog extends Animal {
  String breed;
  String type_of_dog;
  void bark() {
    System.out.println("barking");
  }
  void displayProperties() {
    System.out.println(name + " " + color + " " + tailLength + " " + nooflegs + " " + breed + " " + type_of_dog);
  }
}
public class Inheritance {
  public static void main(String args[]) {
    Dog dog = new Dog();
    dog.name = "puppy";
    dog.color = "white";
    dog.nooflegs = 4;
    dog.tailLength = 2;
    dog.breed = "lab";
    dog.type_of_dog = "petdog";
    dog.displayProperties();
    dog.eat();
    dog.bark();
  }
}