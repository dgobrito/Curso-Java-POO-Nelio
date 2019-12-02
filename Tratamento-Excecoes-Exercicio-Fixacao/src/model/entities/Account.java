package model.entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;

	public Account(int number, String holder, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.withdrawLimit = withdrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		balance += amount;		
	}
	
	public void withdraw(double amount) {
		
		if (amount > withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");		
		}
		
		if (amount > balance) {
			throw new DomainException("Not enough balance");
		}
		
		balance -= amount;		
	}
}
