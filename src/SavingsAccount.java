
public class SavingsAccount {
	
	private double balance;
	private double intrestRent = 0.02;
	private String accountType;
	private int accountNumber;
	static int nextAccountNumber = 10000;
	

	public SavingsAccount(){
	
		accountNumber = nextAccountNumber++;
		
	}
	
	public double getBalance()
	{
		
		return balance;
		
	}
	
	public void deposit(double amount){
		
		balance = balance + amount;
		
		System.out.println("Du har satt in: "+amount+ "kr"+ "Ditt saldo är nu: "+ balance+"kr");
			
	}
	
	public void withdraw(double amount){
		if(amount > balance){
			System.out.println("Du har inte täckning för uttaget på ditt konto: ");
		}
		else{
			
			balance = balance -amount;
			
			System.out.println("Du har tagit ut: "+ amount+"kr"+ "Ditt saldo är nu:"+ balance+"kr");
		}
	}
	public void addintrestRent(double rate)	{
		
		double amount = balance *rate/ 100;
		balance = balance + amount;
		
	}
	
	//public SavingsAccount(){
		//balance = 0;
	//}
	
	public SavingsAccount(double startBalance){
		
		balance = startBalance;
	}
		
	}


