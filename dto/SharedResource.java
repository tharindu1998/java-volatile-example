package dto;

public class SharedResource {
    // Using volatile keyword to ensure visibility
    private volatile boolean flag = false;

    public void setFlagTrue() {
        flag = true;
    }

    public boolean isFlagTrue() {
        return flag;
    }
}

