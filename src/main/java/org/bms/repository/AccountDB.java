package org.bms.repository;

import org.bms.model.Account;

import java.util.List;

public class AccountDB {
    List<Account> accounts;

    public Account viewAccount(Account account) {
        for (Account it : accounts) {
            if (account.get)
        }
    }

    public boolean addAccount(Account newAccount) {
        if (!viewAccount(newAccount)) return accounts.add(newAccount);
        else return false;
    }

    public boolean removeAccount(Account account) {
        if (viewAccount(account)) {


        } else return false;
    }
}
