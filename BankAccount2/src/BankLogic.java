import java.util.ArrayList;
import java.util.Scanner;


public class BankLogic {
	

	

	public ArrayList<String> getAllCustomers()
	//• Returnerar en ArrayList<String> som innehåller en presentation av bankens alla
	//kunder (namn och personnummer)
	public boolean createCustomer(String name, long pNo){
		
		
	}
	//• Skapar upp en ny kund med namnet name samt personnumer pNo, kunden skapas
	//endast om det inte finns någon kund med personnummer pNo.
	//• Returnerar true om kund skapades annars returneras false.
	public ArrayList<String> getCustomer(long pNo)
	//• Returnerar en ArrayList<String> som innehåller informationen om kunden inklusive
	//dennes konton. Första platsen i listan är reserverad för kundens namn och
	//personnummer sedan följer informationen om kundens konton.
	//• Returnerar null om kunden inte fanns
	public boolean changeCustomerName(String name, long pNo)
	//• Byter namn på kund med personnummer pNo till name.
	//• Returnerar true om namnet ändrades annars returnerar false (om kunden inte fanns).
	public ArrayList<String> deleteCustomer(long pNo)
	//• Tar bort kund med personnummer pNo ur banken, alla kundens eventuella konton tas
	//också bort och resultatet returneras. Listan som returneras ska innehålla information om
	//alla konton som togs bort, saldot som kunden får tillbaka samt vad räntan blev.
	//• Returnerar null om ingen kund togs bort
	public int createSavingsAccount(long pNo)
	//• Skapar ett konto till kund med personnummer pNo.
	//• Returnerar kontonumret som det skapade kontot fick alternativt returneras –1 om
	//inget konto skapades.
	public String getAccount(long pNo, int accountId)
	//• Returnerar en String som innehåller presentation av kontot med kontonnummer
	//accountId som tillhör kunden pNo (kontonummer, saldo, kontotyp, räntesats).
	//• Returnerar null om konto inte finns eller om det inte tillhör kunden
	public boolean deposit(long pNo, int accountId, double amount)
	//• Gör en insättning på konto med kontonnummer accountId som tillhör kunden pNo.
	//• Returnerar true om det gick bra annars false.
	public boolean withdraw(long pNo, int accountId, double amount)
	//• Gör ett uttag på konto med kontonnummer accountId som tillhör kunden pNo.
	//• Returnerar true om det gick bra annars false.
	public String closeAccount(long pNr, int accountId)
	//• Avslutar ett konto med kontonnummer accountId som tillhör kunden pNo. När man
	//avslutar ett konto skall räntan beräknas som saldo multiplicerat med ränta/100.
	//• OBS! Enda gången ränta läggs på är när kontot tas bort eftersom årsskiften inte hanteras
	//i denna version av systemet.
	//• Presentation av kontots ska returneras inklusive räntan man får på pengarna.
	//• Returnerar null om inget konto togs bort
}
