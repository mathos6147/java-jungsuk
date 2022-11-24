package example;

public class Ex6_4 {
    public static void main(String[] args) {
        /**
         * 객체를 다루기 위해 참조변수를 선언하고
         * 참조변수와 인스턴스를 연결해야함.
         * ex) Tv t = new Tv();
         * 객체의 사용은
         * ex) t.size = 20; , t.power(); 등과 같이 사용
         *
         */

        Tv t1 = new Tv();
        System.out.println("현재 채널은 " + t1.getChannel() +" 현재 색깔은 " + t1.getColor());
        t1.channelUp();
        t1.changeColor("red");
        System.out.println("현재 채널은 " + t1.getChannel() +" 현재 색깔은 " + t1.getColor());

        Tv t2 = new Tv();
        System.out.println("현재 채널은 " + t2.getChannel() +" 현재 색깔은 " + t2.getColor());
        t2 = t1;
        System.out.println("현재 채널은 " + t2.getChannel() +" 현재 색깔은 " + t2.getColor());
    }
}

class Tv{

    private int channel;
    private boolean power;
    private String color;

    public void power(){
        this.power = !power;
    }
    public void channelUp(){
        this.channel++;
    }
    public void channelDown(){
        this.channel--;
    }
    public void changeColor(String color){
        this.color = color;
    }

    public Tv(){
        this.channel =0;
        this.power = true;
        this.color = "black";
    }

    public int getChannel() {
        return this.channel;
    }

    public String getColor() {
        return this.color;
    }
};