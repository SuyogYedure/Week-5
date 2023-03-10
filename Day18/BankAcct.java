import java.util.Scanner;
class BankAcc{
  Scanner s = new Scanner(System.in);
  long accNo;
  double bal;
  
  BankAcc(long accNo,double bal){
    this.accNo = accNo;
    this.bal = bal;
  }
  void withdraw(){
    System.out.println("Enter amount to withdraw");
    bal = bal - s.nextDouble();
    displayBalance();
  }
  void deposit(){
    System.out.println("Enter amount to deposit");
    bal = bal + s.nextDouble();
    displayBalance();
  }
  void displayBalance(){
    System.out.println("Available Balance is " + bal);
  }
}
public class BankAcct{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Acc No.");
    long accNo = s.nextLong();
    System.out.println("Enter Balance");
    double bal = s.nextLong();
    
 }
}