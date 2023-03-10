class Person{
  String name, gender, address;
  int age;

  void print(){
    System.out.println(name+" "+age+" "+gender);
  }
  void address(){
    System.out.println(address);
  }
}
class Student extends Person {
  int sub1,sub2,sub3;
  int id;

void average(){
  int avg = (sub1 + sub2 + sub3)/ 3;
  System.out.println("Average Marks is: "+avg);
}
void percentage(){
  double per = ((sub1 + sub2 + sub3)/300) *100;
  System.out.println("Percentage is: "+per);
  }
}

public class Inheritance2{
  public static void main(String args[]){
    Student obj = new Student();
    obj.name = "Suyog";
    obj.gender = "Male";
    obj.address = "Karnataka";
    obj.age = 22;
    obj.sub1 = 85;
    obj.sub2 = 92;
    obj.sub3 = 95;
    obj.print();
    obj.address();
    obj.average();
    obj.percentage();
    
  }
}