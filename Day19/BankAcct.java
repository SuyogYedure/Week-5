import java.util.Scanner;
class Bank{
  int bal;
  double interestrate;
  
}
class CheckingAccount extends Bank{
  Scanner s = new Scanner(System.in);
  int transactionfee;
  void withdraw(){
    System.out.println("Enter the Amount");
    int amt = s.nextInt();
    bal = bal - amt - transactionfee;
    System.out.println("Available Balance is: ");
    }
}
class SavingAccount extends Bank{
  int minBalance = 500;
  void addinterest(){
    double interest = bal * interestrate /100;
    bal = bal + interest;
    System.out.println("Adding of interest the balance will be: "+bal);
  }
}
class BankAcct{
  public static void main(String args[]){
    SavingAccount obj = new SavingAccount();
    obj.bal = 100000;
    obj.interestrate = 9.00f;
    obj.transactionfee = 100;
    obj.withdraw();
    obj.addinterest();
  }
}