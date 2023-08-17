
public class BankAccount {
	private String accountnumber;
	private int balance;
	private String Ownername;
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getOwnername() {
		return Ownername;
	}
	public void setOwnername(String ownername) {
		Ownername = ownername;
	}
	public void Deposting(int amount) {
		if(amount>0) {
			balance = balance + amount;
			System.out.println("Deposting amt "+ balance);
		}
		
	}
	public void withdrawing(int amount) {
		if(amount>0 && amount < balance ) {
			balance = balance - amount;
			System.out.println("withdrawing Amount "+ balance);
		}
	}
	public void balance() {
		System.out.println("Balance Amount "+ balance);
	}
	public static void main(String[] args) {
		System.out.println("!!..Welcome to the Bank..!!");
		BankAccount bank = new BankAccount();
		bank.Deposting(20000);
		bank.withdrawing(5000);
		bank.balance();
		
	}
	}
	
