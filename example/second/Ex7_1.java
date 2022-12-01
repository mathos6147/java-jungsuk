package example.second;

public class Ex7_1 {
    /**
     * 상속
     *  - 기존의 클래스로 새로운 클래스를 작성하는 것(코드의 재사용)
     *  - 두 클래스를 부모, 자식의 관계로 맺어주는 것.
     *  - 자손은 조상의 모든 멤버를 상속받는다.(생성자, 초기화 블럭 제외)
     *  - 자손의 멤버 개수는 조상보다 적을 수 없다.(같거나 많다) -----> 조상의 모든 멤버를 상속받기 때문에
     *
     * class 자식클래스 extends 부모클래스 {
     *     // ...
     * }
     *
     *
     */
    public static void main(String[] args) {
        Point3D p1 = new Point3D();
        Point3DChild p2 = new Point3DChild();

        SmartTv stv = new SmartTv();
        stv.channel = 10;
        stv.channelUp();
        System.out.println(stv.channel);
        stv.displayCaption("Hello World");
        stv.caption = true;
        stv.displayCaption("Hello World");
    }
}

class Point{
    int x;
    int y;
}

class Point3D{
    int x;
    int y;
    int z;
}

class Point3DChild extends Point{
    int z;
}

class Tv{
    boolean power;
    int channel;

    void power(){
        power = !power;
    }
    void channelUp(){
        channel++;
    }
    void channelDown(){
        channel--;
    }
}

class SmartTv extends Tv{
    boolean caption;
    void displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
}