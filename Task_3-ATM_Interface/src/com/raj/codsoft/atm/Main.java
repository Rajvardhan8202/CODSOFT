package com.raj.codsoft.atm;

import com.raj.codsoft.atm.model.BankAccount;
import com.raj.codsoft.atm.service.ATM;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Initial balance
        ATM atm = new ATM(account);
        atm.start();
    }
}
