package example.second;

public class Ex7_2 {
    /**
     * 포함
     *  - 클래스의 멤버로 참조 변수를 선언하는 것
     *
     *
     * class Circle{        // circle 이 point 를 포함 관계
     *     Point c = new Point();
     *     int r;
     * }
     *
     * 상속 관계 = 'A는 B이다'
     * 포함 관계 = 'A는 B를 가지고 있다'
     *
     * 원은 점이다 X
     * 원은 점을 가지고 있다 O
     * ---> 원은 점을 가지고 있는 포함 관계
     *
     * 상속은 꼭 필요할때만 사용
     */
    public static void main(String[] args) {
        Circle c = new Circle();
        c.x =1;
        c.y =2;
        c.r =3;
        System.out.println("c.x = "+ c.x);
        System.out.println("c.y = "+ c.y);
        System.out.println("c.r = "+ c.r);

        Circle1 c1 = new Circle1();
        c1.p.x = 1;
        c1.p.y = 2;
        c1.r = 3;
        System.out.println("c1.p.x = "+ c1.p.x);
        System.out.println("c1.p.y = "+ c1.p.y);
        System.out.println("c1.p.r = "+ c1.r);
    }
}


class MyPoint{
    int x;
    int y;
}
class Circle extends MyPoint{

    int r;
}

class Circle1{
    MyPoint p = new MyPoint();  // 참조변수의 초기화
    int r;
}