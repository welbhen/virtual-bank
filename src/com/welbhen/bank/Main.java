package com.welbhen.bank;

import com.welbhen.bank.accounts.Account;
import com.welbhen.bank.accounts.CheckingAcc;
import com.welbhen.bank.accounts.SavingAcc;

public class Main {

	public static void main(String[] args) {
		Client john = new Client();
		john.setName("John Mills");
		
		Account ckAcc = new CheckingAcc(john);
		ckAcc.deposit(1500);
		Account svAcc = new SavingAcc(john);
		ckAcc.showAcc();
		svAcc.showAcc();
		
		ckAcc.transfer(500, svAcc);
		ckAcc.showAcc();
		svAcc.showAcc();
	}

}
