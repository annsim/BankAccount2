
public class SavingsAccount {
	
	private double balance;
	private double intrestRent = 0.02;
	private String accountType;
	private int accountNumber;
	static int nextAccountNumber = 10000;
	
	
	// konstruktorerna som s�tter startv�rdet p� kontot 
	public SavingsAccount(){
	
		accountNumber = nextAccountNumber++;
		balance = 0;
		accountType = "Sparkonto";
		intrestRent = 0.02;
				
	}
	
	// Konstruktor som s�tter startv�rdet p� kontot
	public SavingsAccount(double startBalance){
		
		balance = startBalance;
	}
	
	// Metod f�r att f� fram saldot p� kontot
	public double getBalance()
	{
		
		return balance;
		
	}
	//Metod f�r att hantera ins�ttningen p� kontot
	public void deposit(double amount){
		
		balance = balance + amount;
		
		System.out.println("Du har satt in: "+amount+ "kr"+ "Ditt saldo �r nu: "+ balance+"kr");
			
	}
	//Metod f�r att hantera uttag p� kontot, d�r man ska f� ett felmeddelande om man tar ut mer pengar 
	//�n vad som finns p� kontot
	public void withdraw(double amount){
		if(amount > balance){
			System.out.println("Du har inte t�ckning f�r uttaget p� ditt konto: ");
		}
		else{
			
			balance = balance -amount;
			
			System.out.println("Du har tagit ut: "+ amount+"kr"+ "Ditt saldo �r nu:"+ balance+"kr");
		}
	}
	//Metod f�r att kunna f� fram r�ntan p� kontot
	public void addintrestRent(double rate)	{
		
		double amount = balance *rate/ 100;
		balance = balance + amount;
		
	}
	
	public int getAccount(){
		
		return accountNumber;
	}
	
	//Jag best�mmer att det �r detta som ska skrivas ut
	@Override
	public String toString(){
		return "Typ av konto: " + accountType+ "\n"+
			   "Konto nummer: "+ accountNumber+ "\n"+
			   "Saldo p� kontot: "+balance+ "\n"+
			   "R�ntesatsen p� kontot: "+ intrestRent;
				
	}
			
	}


