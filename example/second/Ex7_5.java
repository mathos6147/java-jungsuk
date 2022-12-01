package example.second;

public class Ex7_5 {
    /**
     * 참조변수 super
     *  - 객체 자신을 가리키는 참조변수. 인스턴스 메서드(생성자)내에만 존재
     *  - 조상의 멤버를 자신의 멤버와 구별할 때 사용
     * this 는 lv와 iv를 구변하기 위해 사용
     *
     * 조상의 생성자 super()
     *  - 조상의 생성자를 호출할 때 사용
     *  - 조상의 멤버는 조상의 생성자를 호출해서 초기화
     *  - *** 생성자의 첫 줄에 반드시 다른 생성자를 호출해야 한다. ***
     *      그렇지 않으면 컴파일러가 생성자의 첫 줄에 super();를 삽입한다.
     *      기본 생성자 작성이 필수여야 상속을 했을때 에러가 나지 않는다.
     *      Point(){} 기본 생성자를 만들어주거나, super(x,y)와 같이 넣어줘야 한다.
     * class Point3D extends Point{
     *     int z;
     *
     *     Point3D(int x, int y, int z){
     *         this.x = x;
     *         this.y = y;
     *         this.z = z;
     *     } // 조상이 선언한 멤버를 초기화 할때 이런 방식은 좋지 않다
     *
     *     Point3D(int x, int y, int z){
     *         super(x,y);
     *         this.z = z;
     *     }// 이렇게 조상이 초기화 하도록 한다.
     * }
     */
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}

class Parent{
    int x =10;  // super.x와 this.x가 모두 가능할 수 있다.
}
class Child extends Parent{
    int x = 20;

    void method(){
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
    }
}