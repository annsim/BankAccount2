
public class Customer extends SavingsAccount {

	private String firstName;
	private String lastName;
	private long persNr;
	
	private SavingsAccount account = new SavingsAccount();

	Customer( String firstName,String lastName, long persNr,SavingsAccount account ){
	
	this.firstName = firstName;
	this.lastName = lastName;
	this.persNr = persNr;
	this.account = account;
}
	public String toString(){
		return
				"Förnamn: "+firstName+"\n"+
				"Efternamn: "+lastName+"\n"+
				"Person nummer: "+persNr+"\n"+
				"Konto nummer: "+account+"\n";
				
		
	}
}