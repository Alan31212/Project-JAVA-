public class Time {
    private int hour;
    private int minute;
    private int second;
    
    //public method
    public Time(){
        this(System.currentTimeMillis());
    }

    public Time(long elapsedTime){
        setTime(elapsedTime);
    }

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    //Define void funtion
    public void setTime(long elapsedTime){
        long totalSeconds = elapsedTime / 1000;
        second = (int)(totalSeconds % 60);

        long totalMinute = (totalSeconds / 60);
        minute = (int)(totalMinute % 60);

        int totalHours = (int) (totalMinute / 60);
        hour = (int)(totalHours % 24);
    }
}
