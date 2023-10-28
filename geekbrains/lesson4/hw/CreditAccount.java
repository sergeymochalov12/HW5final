package geekbrains.lesson4.hw;

public class CreditAccount extends Account {
    private double creditLimit;

    public CreditAccount(double balance, double creditLimit) {
        super(balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > getBalance() + creditLimit) {
            throw new InsufficientFundsException("Exceeding credit limit. Current balance: " + getBalance());
        }
        super.withdraw(amount);
    }
}