package challenge2;

import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private List<BankAccount> bankAccounts =new ArrayList<>() ;

    public void add(BankAccount  a)
    {
        this.bankAccounts.add(a);
    }

    public void TracksTransaction(BankAccount a, BankAccount b, double amount) {
        boolean bankAExists =false;
        boolean bankBExists =false;
        for(BankAccount bA : bankAccounts){
            if (bA.equals(a)){
                bankAExists = true;
            }else if(bA.equals(b)){
                bankBExists = true;
            }

        }
        if (bankAExists  && bankBExists){
            a.deposit(amount);
            b.withdraw(amount);
        }else{
            System.out.println("problem with existance of both accounts");


        }
    }
}
