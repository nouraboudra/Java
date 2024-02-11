import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class PersonalFinanceTracker {


    public List<Transaction> getIncomeList(List<Transaction> transactions){
        List<Transaction> incomesList = new ArrayList<>();
        Stream<Transaction> transactionStream = transactions.stream();
        incomesList = transactionStream.filter((t)-> { return  t.getType().equals("income"); }).toList();
        return incomesList;
    }

    public List<Transaction> getExpensesList(List<Transaction> transactions){
        List<Transaction> expensesList = new ArrayList<>();
        Stream<Transaction> transactionStream = transactions.stream();
        expensesList = transactionStream.filter((t)-> { return  t.getType().equals("expanses"); }).toList();
        return expensesList;
    }

    public double getTotalAmount(List<Transaction> transactions){

        Stream<Transaction> transactionStream = transactions.stream();
        DoubleStream doubleStream = transactionStream.mapToDouble(Transaction::getAmount);

        return doubleStream.sum();
    }


    //HashMap<String, HashMap<, String, List<Transaction>>>
    public Map<String, Map<String, List<Transaction>>> categorizeTransactions(List<Transaction> transactions) {
        return transactions.stream().collect(Collectors.groupingBy(Transaction::getType, Collectors.groupingBy(Transaction::getCategory)));
    }
    public double getNetSaving(List<Transaction> transactions){
        double netSaving = getTotalAmount(getIncomeList(transactions)) - getTotalAmount(getExpensesList(transactions));
    return netSaving;
    }
    public void generateReport(String filePath, List<Transaction> transactions) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(filePath);

        printWriter.println("here is your report for the given transaction file");

        printWriter.println("total income :" +getTotalAmount(getIncomeList(transactions)));
        printWriter.println("total expenses :"+getTotalAmount(getExpensesList(transactions)));
        printWriter.println("Net Savings  :"+getNetSaving(transactions));

        printWriter.println("here is the expenses per category : ");

        Map<String, Map<String, List<Transaction>>>  categorizedTransactions = categorizeTransactions(transactions);
        Map<String, List<Transaction>> expensesMap = categorizedTransactions.get("expense");

        expensesMap.forEach((category, transactionList) -> {
            printWriter.println( " \t "+category+ ": "+getTotalAmount(transactionList));

        });

 printWriter.close();

    }
    public List<Transaction> getTransactionsFromFileAsList(String filePath) throws IOException, ParseException {

        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        ArrayList<Transaction> transactions= new ArrayList<>();
        String line;

        while( (line = bufferedReader.readLine() ) != null) {
            String values [] = line.split(",");// ["01-12-2023","income","sales",14000]

            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            String dateInString = values[0];
            Date date = formatter.parse(dateInString);
            String type = values[1];
            String category = values[2];
            double amount = Double.parseDouble(values[3]);
            Transaction transaction = new Transaction(date,type,category,amount);
            transactions.add(transaction);
        }
        return transactions;
    }





}