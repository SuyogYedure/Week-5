import java.util.Scanner;
public class Application {
  public static void main(String[] args) {

    Scanner s=new Scanner(System.in);
    System.out.println("Enter your id");
    int id=s.nextInt();
    System.out.println("Enter your name");
    String name=s.next();
    System.out.println("Enter your gender");
    String gender=s.next();
    System.out.println("Enter your city");
    String city=s.next();
    Student std=new Student();
    std.setId(id);
    std.setGender(gender);
    std.setName(name);
    std.setCity(city);
    System.out.println("Id: "+std.getId());
    System.out.println("Name: "+std.getName());
    System.out.println("gender: "+std.getGender());
    System.out.println("city: "+std.getCity());
  }
} 
public class Student {
  private int id;
  private String name,gender,city;
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }
}