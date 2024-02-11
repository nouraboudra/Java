import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClassMain {

    public static void main(String[] args) {


        Task t = new Task( "A", 5000);
        Task t1 = new Task("B",1000);
        Task t2 = new Task("C",9000);

        System.out.println("Synchronous Task Execution:");
        Thread thread = new Thread( () -> { Task.executeTask(t); Task.executeTask(t1);Task.executeTask(t2);});
        thread.start();


        System.out.println("\nAsynchronous Task Execution:");
        CompletableFuture<String> futureT = t.executeTasksAsync();
        CompletableFuture<String> futureT1 = t1.executeTasksAsync();
        CompletableFuture<String> futureT2 = t2.executeTasksAsync();

        CompletableFuture<Void> allOf = CompletableFuture.allOf(futureT, futureT1, futureT2);

        allOf.join();


        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(t);
        executorService.submit(t1);
        executorService.submit(t2);


        executorService.shutdown();


    }
}
