package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable {

    private BankAccount acct;
    private double hoursWorked;
    private double wage;

    public Employee() {
        this.wage = 35.0;
        this.acct = new BankAccount();
    }

    public Employee(BankAccount bankAccount) {
        this.acct = bankAccount;
        this.wage = 35.0;
    }

    public BankAccount getBankAccount() {
        return this.acct;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.acct = bankAccount;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        this.hoursWorked += numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return this.hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return this.wage;
    }

    @Override
    public Double getMoneyEarned() {
        return this.wage * this.hoursWorked;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        this.acct.deposit(amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        this.acct.withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return this.acct.getBalance();
    }
}
