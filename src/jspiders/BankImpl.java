package jspiders;

public class BankImpl implements Bank {
	 private int balance;
	public BankImpl(int balance) {
		this.balance = balance;
	}

	@Override
	public void deposit(int amount) {
		System.out.println("depositing Rs."+amount);
		balance=balance+amount;
		System.out.println("amount deposited successfully");
		
	}

	@Override
	public void withdraw(int amount) {
		if(amount<=balance) {
			System.out.println("Withdrawing Rs."+amount);
			balance=balance-amount;
			System.out.println("amount withdrawn successfully");
		}
		else {
//			invoke an exception and handle it using try and catch block
//			InsufficientBalanceException
			try {
				throw new InsufficientBalanceException("Insufficient balance");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	
		
	}

	@Override
	public int getBalance() {
		
		return balance;
	}

	@Override
	public String displayErrorMessage() {
		
		return "inavlid enter" ;
	}

}
