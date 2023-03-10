import java.util.Scanner;
class Bank{
  Scanner s = new Scanner(System.in);
  double loanamt;
  double interestrate;
  int payperiod;

  Bank(double loanamt, double interestrate){
    
  this.loanamt = loanamt;
  this.interestrate = interestrate; 
  }
  void payperiod(){
    System.out.println("Enter amount which should be paid monthly");
    int amt = s.nextInt();
    int count = 0;
    double interest = loanamt*interestrate/100;
    loanamt = loanamt + interest;
    while(loanamt>0)
      {
      loanamt = loanamt-amt;
      count = count+1;
    }
    payperiod = count;
    System.out.println("The time period required for loan amount is "+payperiod+" Months");
  }
}
class BankLoan{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Loan amount");
    double loanamt = s.nextInt();
    System.out.println("Enter Interest Rate");
    double interestrate = s.nextDouble();
    Bank obj = new Bank(loanamt,interestrate);
    obj.payperiod();
  }
}