package challenge2;

public class SavingsAccount extends BankAccount {

    final double TAUX=0.2;

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
