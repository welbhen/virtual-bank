package com.welbhen.bank.accounts;

import com.welbhen.bank.Client;

public class CheckingAcc extends Account {
	public CheckingAcc(Client client) {
		super(client);
	}

	@Override
	public void showAcc() {
		System.out.println("=== Checking Account Status ===");
		super.printAccInfo();
	}
	
}
