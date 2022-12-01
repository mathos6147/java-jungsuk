package example.second;

public class Ex7_4 {
    /**
     * 오버라이딩
     *  - 상속받은 조상의 메서드를 자신에 맞게 변경하는 것
     *
     *
     * class Point{
     *     int x;
     *     int y;
     *
     *     String getLocation(){
     *         return "x :" + x + ", y :" + y;
     *     }
     * }
     *
     * class Point3D extends Point{
     *     int z;
     *
     *     String getLocation(){
     *         return "x :" + x + ", y :" + y + ", z :" + z;
     *     }
     * }
     *
     * 오버라이딩의 조건
     *  1. 선언부가 조상 클래스의 메서드와 일치해야 한다. (반환타입, 메서드 이름, 매개변수 목록)
     *  2. 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다. (public, protected, private, (default))
     *  3. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.
     *
     * class Parent{
     *     void parentMethod() throws IOException, SQLException{  <--- 부모가 예외 2개
     *         //...
     *     }
     * }
     *
     * class Child extends Parent{
     *     void parentMethod() throws IOException{  <--- 자식이 예외 1개라서 가능함. 예외가 3개라면 안됨.
     *         //...
     *     }
     * }
     *
     * 오버로딩 : 기존에 없는 새로운 메서드를 정의하는 것(이름이 같을 뿐) -> 상속과 관계 없음
     * 오버라이딩 : 상속받은 메서드의 내용을 변경하는 것(기존의 것을 바꾸는 것) -> 상속과 관계 있음. 상속 받은걸 바꾸는 거니까
     */

    public static void main(String[] args) {
        Point3D3 p = new Point3D3();
        p.x = 1;
        p.y = 2;
        p.z = 3;
        System.out.println(p.getLocation());
        System.out.println(p.toString());
        System.out.println(p);
        // toString 을 오버라이딩 하지 않으면 주소값만 나온다.
    }
}


class Point3{
    int x;
    int y;
    String getLocation(){
        return "x :" + x + ", y :" + y;
    }
    public String toString(){
        return "x:"+x+", y:"+y;
    }
}

class Point3D3 extends Point3{
    int z;
    @Override
    String getLocation(){
        return "x :" + x + ", y :" + y + ", z :" + z;
    }
}