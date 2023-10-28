package geekbrains.lesson4.hw;

public class Transaction {
    public static void transfer(Account from, Account to, double amount) throws InsufficientFundsException {
        from.withdraw(amount);  // Если неудачно, возникнет исключение
        to.deposit(amount);
    }
}
