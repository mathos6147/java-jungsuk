package example.second;

public class Ex7_3 {
    /**
     * 단일 상속
     *  - java는 단일 상속만을 허용한다.(c++은 다중상속 허용)
     *  - 비중이 높은 클래스 하나만 상속관계로, 나머지는 포함 관계로 한다. (다중상속과 같은 느낌을 낼 수 있다)
     * class TvDVD extends Tv, DVD{ // 에러! 조상은 하나만 허용된다.
     *      //...
     * }
     *
     * Object 클래스 --> 모든 클래스의 조상
     *  - 부모가 없는 클래스는 자동적으로 Object 클래스를 상속받게 된다.
     *  - 모든 클래스는 Object 클래스에 정의된 11개의 메서드를 상속받는다.
     *  - toString(), equals(Object obj), hashCode(), ...
     *
     *  Object    <-------   Tv  <-------   SmartTv
     */
    public static void main(String[] args) {
        Circle c= new Circle();
        System.out.println(c.toString());
        System.out.println(c);  // 위와 동일한 결과
    }
}