import java.util.Scanner;
 class Account {
	 private String accountNumber;
	    private double balance;

	    public Account(String accountNumber) {
	        this.accountNumber = accountNumber;
	        this.balance = 0.0; // Initialize balance to 0
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited $" + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn $" + amount);
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }

	    public void transfer(Account destinationAccount, double amount) {
	        if (amount > 0 && amount <= balance) {
	            withdraw(amount);
	            destinationAccount.deposit(amount);
	            System.out.println("Transferred $" + amount + " to account " + destinationAccount.getAccountNumber());
	        } else {
	            System.out.println("Invalid transfer amount.");
	        }
	    }

	    public String getAccountNumber() {
	        return accountNumber;
	    }
	}

