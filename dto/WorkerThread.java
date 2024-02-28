package dto;

public class WorkerThread extends Thread {
    private SharedResource sharedResource;

    public WorkerThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {

        // You can modify the sharedVariable here
        sharedResource.setFlagTrue();

        // You can do some more work here...
    }
}
