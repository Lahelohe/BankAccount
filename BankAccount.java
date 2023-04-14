public class BankAccount {
  
    double balance;
    boolean honor;
    double investments;
    double debt;
    


    // CLASS
    public BankAccount(double initialBalance, double initialInvestments, double initialDebt, boolean defaultTrusted){
      balance = initialBalance;
      honor = defaultTrusted;
      investments = initialInvestments;
      debt = initialDebt;
    }  



    // ADDED METHODS
    // Enable to check balance
    public void checkBalance(){
      if (honor) {
      System.out.println("Your balance is " + balance);
      } else {
        System.out.println("Account suspended, contact operator for more information.");
      }
    }
  
    // Enable withdrawing from specified account
    public double deposit(double amountToDeposit){
      if (honor) {
      double newBalance = balance + amountToDeposit;
      balance = newBalance;
      System.out.println("You just deposited " + amountToDeposit);
     } else {
      System.out.println("Account suspended, contact operator for more information.");
     }
      return balance;
    }
  
    // Enable withdrawing from specified account
    public double withdraw(double amountToWithdraw){
      if (honor) {
      double newBalance = balance - amountToWithdraw;
      balance = newBalance;
      System.out.println("You just withdew " + amountToWithdraw);
      } else {
        System.out.println("Account suspended, contact operator for more information.");
      }
      return balance;
    }

    // Enables investing money from balance
    public double invest(double amountToInvest){
      if (honor) {
      double totalInvestments = investments + amountToInvest;
      balance = balance - amountToInvest;
      investments = totalInvestments;
      System.out.println("You have invested" + amountToInvest);
      } else {
        System.out.println("Account suspended, contact operator for more information.");
      }
      return balance;
    }

    // Enables account to go in debt
    public void checkDebt(){
      if (honor){
      if (balance <= 0) {
        System.out.println("You are " + balance + " in debt");
      } else {
       System.out.println("You don't have any account debt");
      }
    } else {
      System.out.println("Account suspended, contact operator for more information.");
    }
    }

    // Change user's trust state incase of misuse
    public boolean changeHonor(boolean honorType){
      boolean newHonor = honorType;
      honor = newHonor;
      System.out.println("Account suspended.");
      return honor;
    }
  


    // MAIN METHOD
    public static void main(String[] args){
       BankAccount account1 = new BankAccount(0, 0, 0, true);

       //Call functions here
      
       /*
      account1.deposit(500);
      account1.checkBalance();
      account1.withdraw(300);
      account1.checkBalance();
      account1.invest(100);
      account1.checkBalance();
      account1.checkDebt();
      account1.changeHonor(false);
      account1.checkBalance();
      */
    }       
  }