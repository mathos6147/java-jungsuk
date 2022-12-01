package example.second;

public class Ex7_10 {
    /**
     * 캡슐화와 접근 제어자
     *
     * Q. 접근 제어자를 사용하는 이유?
     * A. 외부로부터 데이터를 보호하기 위해서, 외부에는 불필요한 내부적으로만 사용되는 부분을 감추기 위해서
     */
    public static void main(String[] args) {
        Time t = new Time();
        t.setHour(21);
        System.out.println(t.getHour());
        t.setHour(100);
        System.out.println(t.getHour());
    }
}

class Time{
    private int hour;
    private int minute;
    private int second;

    public void setHour(int hour) {
        if(isValidHour(hour)) return;
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if(isValidMinute(minute)) return;
        this.minute = minute;
    }

    public void setSecond(int second) {
        if(isValidSecond(second)) return;
        this.second = second;
    }

    private boolean isValidHour(int hour){
        return hour<0 || hour >23;
    }
    private boolean isValidMinute(int minute){
        return minute<0 || minute>59;
    }
    private boolean isValidSecond(int second){
        return second<0 || second>59;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
