
public class Customer extends SavingsAccount {

	private String firstName;
	private String lastName;
	private long persNr;

	Customer( String firstName,String lastName, long persNr){
	
	this.firstName = firstName;
	this.lastName = lastName;
	this.persNr = persNr;
	
}
	public String toString(){
		return
				"Förnamn: "+firstName+"\n"+
				"Efternamn: "+lastName+"\n"+
				"Person nummer: "+persNr+"\n";
				
		
	}
}