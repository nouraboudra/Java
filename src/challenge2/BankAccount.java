package challenge2;


import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount implements Transactable {
    protected double balance;
    protected List<Transaction> transactionHistory;

    public BankAccount() {
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add(new Transaction(TransactionType.DEPOSIT, amount));
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactionHistory.add(new Transaction(TransactionType.WITHDRAWAL, amount));
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void displayTransactionHistory() {
        System.out.println("Transaction History:");
        for (Transaction transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}