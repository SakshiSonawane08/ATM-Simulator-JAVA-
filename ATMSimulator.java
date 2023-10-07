import java.util.Scanner;
public class ATMSimulator {

	
		public static void main(String[] args) {
	        Account account1 = new Account("123456");
	        Account account2 = new Account("789101");

	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nATM Simulator");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Transfer");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            switch (choice) {
	                case 1:
	                    System.out.println("Account 1 Balance: $" + account1.getBalance());
	                    System.out.println("Account 2 Balance: $" + account2.getBalance());
	                    break;

	                case 2:
	                    System.out.print("Enter deposit amount: $");
	                    double depositAmount = scanner.nextDouble();
	                    account1.deposit(depositAmount);
	                    break;

	                case 3:
	                    System.out.print("Enter withdrawal amount: $");
	                    double withdrawalAmount = scanner.nextDouble();
	                    account1.withdraw(withdrawalAmount);
	                    break;

	                case 4:
	                    System.out.print("Enter transfer amount: $");
	                    double transferAmount = scanner.nextDouble();
	                    account1.transfer(account2, transferAmount);
	                    break;

	                case 5:
	                    System.out.println("Exiting the ATM simulator.");
	                    scanner.close();
	                    System.exit(0);
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	
}
