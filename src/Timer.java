public class Timer {
    private long startTime;
    private long currentTime;

    public Timer(){
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getCurrentTime() {
        return currentTime - this.startTime;
    }


}
