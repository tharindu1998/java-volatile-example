import dto.SharedResource;
import dto.WorkerThread;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Creating and starting multiple threads
        WorkerThread thread1 = new WorkerThread(sharedResource);
        WorkerThread thread2 = new WorkerThread(sharedResource);

        thread1.start();
        thread2.start();

        // Wait for threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Checking the shared variable after threads complete
        System.out.println("Is flag set to true? " + sharedResource.isFlagTrue());
    }
}
