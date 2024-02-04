package challenge2;

public class Main {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount();
        CheckingAccount checkingAccount = new CheckingAccount();


        TransactionManager transactionManager = new TransactionManager();

        transactionManager.add(savingsAccount);
        transactionManager.add(checkingAccount);



        System.out.println("Initial Savings Account Balance: $" + savingsAccount.balance);
        savingsAccount.deposit(1000);
        System.out.println("After deposit: $" + savingsAccount.balance);
        savingsAccount.withdraw(200);
        System.out.println("After withdrawal: $" + savingsAccount.balance);
        savingsAccount.displayTransactionHistory();

        System.out.println("*********************************************\n");

        System.out.println("Initial Checking Account Balance: $" + checkingAccount.balance);
        checkingAccount.deposit(500);
        System.out.println("After deposit: $" +checkingAccount.balance);
        checkingAccount.withdraw(50);
        System.out.println("After withdrawal: $" +checkingAccount.balance);
        checkingAccount.displayTransactionHistory();

        System.out.println("*********************************************\n");

        System.out.println("Initial Balances - Account A: $" +savingsAccount.balance + ", Account B: $" +checkingAccount.balance);
        transactionManager.TracksTransaction(savingsAccount, checkingAccount, 100);
        System.out.println("After Transaction - Account A: $" +savingsAccount.balance + ", Account B: $" +checkingAccount.balance);


    }
}