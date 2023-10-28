package geekbrains.lesson4.hw;

public class Main {
    public static void main(String[] args) {
        Account debitAccount = new DebitAccount(100);
        Account creditAccount = new CreditAccount(50, 150);

        try {
            debitAccount.withdraw(150);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            Transaction.transfer(debitAccount, creditAccount, 60);
            System.out.println("Transaction successful!");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Debit Account Balance: " + debitAccount.getBalance());
        System.out.println("Credit Account Balance: " + creditAccount.getBalance());
    }
}
