package com.welbhen.bank.accounts;

import com.welbhen.bank.Client;

public class SavingAcc extends Account {
	public SavingAcc(Client client) {
		super(client);
	}

	@Override
	public void showAcc() {
		System.out.println("=== Saving Account Status ===");
		super.printAccInfo();
	}
}
