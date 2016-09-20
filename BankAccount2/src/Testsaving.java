
public class Testsaving {

	public static void main(String[] args) {
		 SavingsAccount harrysAccount = new SavingsAccount(1000);
		 harrysAccount.deposit(500); // Balance is now $1500
		 harrysAccount.withdraw(2000); // Balance is now $1490
		 harrysAccount.addintrestRent(1); // Balance is now $1490 + 14.90
		 System.out.printf("%.2f\n", harrysAccount.getBalance());
		 System.out.println("Expected: 1504.90");

	}

}
