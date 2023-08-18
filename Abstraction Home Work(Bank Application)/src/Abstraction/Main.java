package Abstraction;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("HDFC9874515399", "Feroz", 40000, 0.10);
        savingsAccount.deposit(1500.0);
        savingsAccount.withdraw(2000.0);

        System.out.println("Account Holder: " + savingsAccount.getAccountHolderName());
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance: $" + savingsAccount.getBalance());
        System.out.println();
        CheckinAccount c = new CheckinAccount("SBI98325999","Ashok ",980000,20000);
       
       System.out.println("Account No :"+ c.accountNumber);
       System.out.println("Account Holder Name :"+c.accountHolderName);
       System.out.println("Account Balance :"+ c.balance);
       c.deposit(22000);
       c.withdraw(9000);
    }

}
