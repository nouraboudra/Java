import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user for the input file path
            System.out.print("Enter the path of the transaction file: ");
            String filePath = scanner.nextLine();

            try {
                PersonalFinanceTracker tracker = new PersonalFinanceTracker();
                List<Transaction> transactions = tracker.getTransactionsFromFileAsList(filePath);

                // Generate and display the report
                tracker.generateReport("output.txt", transactions);
                System.out.println("Report generated successfully!");

            } catch (IOException | ParseException e) {
                System.err.println("Error reading the file or parsing transactions. Please check the file format.");
                e.printStackTrace();
            }
        }

}
