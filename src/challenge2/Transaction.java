package challenge2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private TransactionType type;
    private double amount;
    private LocalDateTime transactionDateTime;

    public Transaction(TransactionType type, double amount) {
        this.type = type;
        this.amount = amount;
        this.transactionDateTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = transactionDateTime.format(formatter);

        return type + ": $" + amount + " at " + formattedDateTime;
    }
}