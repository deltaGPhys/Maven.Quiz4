package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    private List<BankAccount> accts;

    public Bank() {
        this.accts = new ArrayList<>();
    }

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        accts.remove((int) indexNumber);
        return null;
    }

    public void addBankAccount(BankAccount bankAccount) {
        accts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return accts.contains(bankAccount);
    }
}
