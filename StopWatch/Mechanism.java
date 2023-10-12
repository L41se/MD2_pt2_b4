package StopWatch;

public class Mechanism{
    private long startTime;
    private long endTime;

    public Mechanism(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Mechanism() {

    }

    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }
    public void setStartTime() {
        this.startTime = System.currentTimeMillis();
    }
    public void setEndTime() {
        this.endTime = System.currentTimeMillis();
    }
    public long Elapsed(){
        return endTime - startTime;
    }
    public String wrongInput(){
        return "Wrong number u jackass";
    }
}
