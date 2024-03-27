class BankAccount{
	private String account_no;
	private double balance;
	private static double interest;

	public BankAccount(String acc_no,double bal){
		account_no = acc_no;
		balance = bal;
	}

	public static void setInterest(double i){
		interest = i;
	}
	public static void displayInterest(){
		System.out.println("interest rate: " + interest + "%");
	}
	public double getBalance(){
		return balance;
	}
	public double calculateInterest(){
		return (balance * interest) / 100 ;
	}
}

class q9{
	public static void main(String args[]){
		BankAccount account = new BankAccount("1234",200);
		BankAccount.setInterest(5);
		BankAccount.displayInterest();
		System.out.println("Balance: "+account.getBalance());
		System.out.println("Interest on balance: "+account.calculateInterest());
	}
}