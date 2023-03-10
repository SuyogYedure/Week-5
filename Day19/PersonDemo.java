class Person{
  String name;
  int age;
}
class Employee extends Person{
  double salary;
  String position;
}
class Engineer extends Employee{
  String specialization;
  void solve_problem(){
    System.out.println("Problem solved!");
  }
}
class Manager extends Employee{
  int num_reports;
  void hire_employee(){
    num_reports++;
  }
}
public class PersonDemo{
  public static void main(String[] args){
    Engineer engineer=new Engineer();
    engineer.solve_problem();
  }
}