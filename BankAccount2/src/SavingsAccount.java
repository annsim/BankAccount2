
public class SavingsAccount {
	
	private double balance;
	private double intrestRent = 0.02;
	private String accountType;
	private int accountNumber;
	static int nextAccountNumber = 10000;
	
	
	// konstruktorerna som sätter startvärdet på kontot 
	public SavingsAccount(){
	
		accountNumber = nextAccountNumber++;
		balance = 0;
		accountType = "Sparkonto";
		intrestRent = 0.02;
				
	}
	
	// Konstruktor som sätter startvärdet på kontot
	public SavingsAccount(double startBalance){
		
		balance = startBalance;
	}
	
	// Metod för att få fram saldot på kontot
	public double getBalance()
	{
		
		return balance;
		
	}
	//Metod för att hantera insättningen på kontot
	public void deposit(double amount){
		
		balance = balance + amount;
		
		System.out.println("Du har satt in: "+amount+ "kr"+ "Ditt saldo är nu: "+ balance+"kr");
			
	}
	//Metod för att hantera uttag på kontot, där man ska få ett felmeddelande om man tar ut mer pengar 
	//än vad som finns på kontot
	public void withdraw(double amount){
		if(amount > balance){
			System.out.println("Du har inte täckning för uttaget på ditt konto: ");
		}
		else{
			
			balance = balance -amount;
			
			System.out.println("Du har tagit ut: "+ amount+"kr"+ "Ditt saldo är nu:"+ balance+"kr");
		}
	}
	//Metod för att kunna få fram räntan på kontot
	public void addintrestRent(double rate)	{
		
		double amount = balance *rate/ 100;
		balance = balance + amount;
		
	}
	
	public int getAccount(){
		
		return accountNumber;
	}
	
	//Jag bestämmer att det är detta som ska skrivas ut
	@Override
	public String toString(){
		return "Typ av konto: " + accountType+ "\n"+
			   "Konto nummer: "+ accountNumber+ "\n"+
			   "Saldo på kontot: "+balance+ "\n"+
			   "Räntesatsen på kontot: "+ intrestRent;
				
	}
			
	}


