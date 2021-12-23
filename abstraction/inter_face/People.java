package com.thoughtfocus.abstraction.inter_face;

public class People {
	public static void main(String[] args) {
		Debitcard debitcard = new Debitcard();
		CreditCard creditcard = new CreditCard();
		ATM.atm(debitcard);
		ATM.atm(creditcard);
	}
}
