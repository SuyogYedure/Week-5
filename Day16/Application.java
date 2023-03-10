import java.util.Scanner;
public class Application {
  Scanner s=new Scanner(System.in);
  Student std=new Student();
  public void setStudentDetails() {
    // setting student details
    System.out.println("Enter your id");
    std.setId(s.nextInt());
    System.out.println("Enter your name");
    std.setName(s.next());
    System.out.println("Enter your gender");
    std.setGender(s.next());
    System.out.println("Enter your city");
    std.setCity(s.next());
  }
  public void getStudentDetails() {
    // getting student details
    System.out.println("Id: "+std.getId());
    System.out.println("Name: "+std.getName());
    System.out.println("gender: "+std.getGender());
    System.out.println("city: "+std.getCity());
  }
  public static void main(String[] args) {
    Application student=new Application();
    student.setStudentDetails();
    student.getStudentDetails();
  }
}

