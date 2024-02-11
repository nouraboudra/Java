import java.util.concurrent.CompletableFuture;

public class Task implements Runnable {



    private static int taskIdCnt = 0;
    private final int TASKID;
    private final String taskName;
    private final long duration;

    public long getDuration() {
        return duration;
    }


    public Task( String taskName, long duration) {
        this.TASKID = taskIdCnt++;;
        this.taskName = taskName;
        this.duration = duration;
    }

    static void executeTask(Task task) {

        synchronized (task) {
            task.run();
        }
    }


    @Override
    public void run() {
            try {
                Thread.sleep(duration);
                System.out.println("Executing Task : "+taskName+" ...Completed! (Duration: "+duration +"  ms)");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }



    public CompletableFuture<String> executeTasksAsync() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Task " + taskName + " started asynchronously.");
            try {
                Thread.sleep(duration); // Simulating preparation time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task " + taskName + " completed asynchronously! (Duration: " + duration + " ms)");
            return "Task " + taskName + " completed asynchronously! (Duration: " + duration + " ms)";
        });
    }


}
