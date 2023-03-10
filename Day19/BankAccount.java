import java.util.Scanner;
class Bank {
  double bal;
  float intrestrate;
}
class SavingsAccount extends Bank {
  Scanner s = new Scanner(System.in);
  double minBalance = 500;

  void withdraw() {
    while(true){
      System.out.println("Enter the Amount");
      double amt = s.nextDouble();
      double balance = bal - amt;
      if ( balance>= minBalance) {
        bal=bal-amt;
        System.out.println("Available balance is " + bal);
        break;
      }
      else {
        System.out.println("Amount must be greater than minimum balance");
      }
    }
  }
}
public class BankAccount {
  public static void main(String[] args) {
    SavingsAccount obj = new SavingsAccount();
    obj.bal = 100000;
    obj.intrestrate = 9.00f;
    obj.withdraw();
  }
}