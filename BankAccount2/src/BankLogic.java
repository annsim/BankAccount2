import java.util.ArrayList;
import java.util.Scanner;


public class BankLogic {
	

	

	public ArrayList<String> getAllCustomers()
	//� Returnerar en ArrayList<String> som inneh�ller en presentation av bankens alla
	//kunder (namn och personnummer)
	public boolean createCustomer(String name, long pNo){
		
		
	}
	//� Skapar upp en ny kund med namnet name samt personnumer pNo, kunden skapas
	//endast om det inte finns n�gon kund med personnummer pNo.
	//� Returnerar true om kund skapades annars returneras false.
	public ArrayList<String> getCustomer(long pNo)
	//� Returnerar en ArrayList<String> som inneh�ller informationen om kunden inklusive
	//dennes konton. F�rsta platsen i listan �r reserverad f�r kundens namn och
	//personnummer sedan f�ljer informationen om kundens konton.
	//� Returnerar null om kunden inte fanns
	public boolean changeCustomerName(String name, long pNo)
	//� Byter namn p� kund med personnummer pNo till name.
	//� Returnerar true om namnet �ndrades annars returnerar false (om kunden inte fanns).
	public ArrayList<String> deleteCustomer(long pNo)
	//� Tar bort kund med personnummer pNo ur banken, alla kundens eventuella konton tas
	//ocks� bort och resultatet returneras. Listan som returneras ska inneh�lla information om
	//alla konton som togs bort, saldot som kunden f�r tillbaka samt vad r�ntan blev.
	//� Returnerar null om ingen kund togs bort
	public int createSavingsAccount(long pNo)
	//� Skapar ett konto till kund med personnummer pNo.
	//� Returnerar kontonumret som det skapade kontot fick alternativt returneras �1 om
	//inget konto skapades.
	public String getAccount(long pNo, int accountId)
	//� Returnerar en String som inneh�ller presentation av kontot med kontonnummer
	//accountId som tillh�r kunden pNo (kontonummer, saldo, kontotyp, r�ntesats).
	//� Returnerar null om konto inte finns eller om det inte tillh�r kunden
	public boolean deposit(long pNo, int accountId, double amount)
	//� G�r en ins�ttning p� konto med kontonnummer accountId som tillh�r kunden pNo.
	//� Returnerar true om det gick bra annars false.
	public boolean withdraw(long pNo, int accountId, double amount)
	//� G�r ett uttag p� konto med kontonnummer accountId som tillh�r kunden pNo.
	//� Returnerar true om det gick bra annars false.
	public String closeAccount(long pNr, int accountId)
	//� Avslutar ett konto med kontonnummer accountId som tillh�r kunden pNo. N�r man
	//avslutar ett konto skall r�ntan ber�knas som saldo multiplicerat med r�nta/100.
	//� OBS! Enda g�ngen r�nta l�ggs p� �r n�r kontot tas bort eftersom �rsskiften inte hanteras
	//i denna version av systemet.
	//� Presentation av kontots ska returneras inklusive r�ntan man f�r p� pengarna.
	//� Returnerar null om inget konto togs bort
}
