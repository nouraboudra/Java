package challenge2;

public class CheckingAccount extends BankAccount {
    final double TAUX=0.03;

    @Override
    public void withdraw(double amount) {
        if ((amount *TAUX)<= balance) {
            balance -= amount * TAUX;
            transactionHistory.add(new Transaction(TransactionType.WITHDRAWAL, amount));
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
