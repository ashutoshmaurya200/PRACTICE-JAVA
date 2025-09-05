//Create a class BankAccount with:
//
//Fields: accountNumber (int), balance (double) , customer name (String) , phone number (String)

//Add suitable constructor
//
//Methods:
//
//deposit(double amount)
//
//withdraw(double amount) (should not allow negative balance by default)
//
//getAccountSummary() - returns complete details of the account , in string format
//
//getBalance() - returns account balance.
//
//Create subclasses:
//
//SavingAccount -> add interestRate field and method applyInterest().
//
//CurrentAccount ->  add overdraftLimit field and method useOverdraftFacility().
//
//SavingAccount -> should not allow any negative balance in  withdraw operation .It should fail in such case.
//
//CurrentAccount -> should  allow any negative balance, in withdraw operation .It should not fail till it exceeds the overdraft limit. After overdraft limit is exceeded then withdraw operation should fail.
//
//
package com.core;

public class BankAccount {
	private int accountNumber;
	private double balance;
	private String customerName;
	private String phoneNo;

	BankAccount(int accountNumber, double balance, String customerName, String phoneNo){
		
		//System.out.println("constructor 1 here...");
		this.accountNumber = accountNumber ;
		this.balance=balance;
		this.customerName=customerName;
		this.phoneNo=phoneNo;
		
	}

	public double deposit(double addmoney) {
		
		return balance+ addmoney;

		
	}
	public String toString() {
		

		return this.accountNumber +" "+this.balance+ " "+this.customerName+" "+this.phoneNo;
	}
	public double getBalance() {
		return balance;
		
	}
	

	public int getAccountno() {
		// TODO Auto-generated method stub
		return accountNumber;
	}



}
