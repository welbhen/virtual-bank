package com.welbhen.bank.accounts;

public interface IAcc {
	void withdraw(double value);
	void deposit(double value);
	void transfer(double value, Account destination);
	void showAcc();
}
