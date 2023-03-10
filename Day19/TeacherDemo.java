class Teacher{
  String designation, collegename;
  void work(){
    System.out.println("Designation is: "+designation);
    System.out.println("College Name is: "+collegename);
    }
  }
class ComputerTeacher extends Teacher{
  
}
class TeacherDemo{
  public static void main(String args[]){
    ComputerTeacher obj = new ComputerTeacher();
    obj.designation = "Computer Teacher";
    obj.collegename = "IIT";
    obj.work();
  }
}