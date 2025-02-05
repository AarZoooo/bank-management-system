package org.bms.service;

import org.bms.model.Account;
import org.bms.repository.AccountDB;

public class AccountManagement {
    private final AccountDB data;

    public AccountManagement(AccountDB data) {
        this.data = data;
    }

    public void addAccount(Account newAccount) {
        data.addAccount(newAccount);
    }

    public void removeAccount(Account toDelete) {
        data.removeAccount(toDelete);
    }

    public void searchAccount(Account account) {
        data.viewAccount(account);
    }

    public void updateAccount(Account account) {
        data.updateAccount(account);
    }
}
