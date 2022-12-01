package example.second;

public class Ex6_7 {
    /**
     * 변수 선언을 먼저 함.
     * 메서드도 순서가 없음.
     *
     * 클래스 변수(cv) : 클래스 영역              클래스가 메모리에 올라갈 때 생성
     *                                      -> 아무때나 사용가능함.
     *                                      -> 객체를 안만들어도 사용 가능함.
     *
     * 인스턴스 변수(iv) : 클래스 영역            인스턴스가 생성되었을 때 생성 ** 중요 **
     *                                      -> Variable variable = new Variable(); 시에 생성
     *                                      -> 객체 생성시에 만들어진다.
     * 지역 변수(lv) : 클래스 영역 이외의 영역      변수 선언문이 수행되었을 때 생성
     *
     */

    public static void main(String[] args) {
        Variable.cv =6;
        Variable variable1 = new Variable();
        Variable variable2 = new Variable();
        System.out.println(variable1.cv);
        variable1.cv = 8;
        System.out.println(variable2.cv);
    }
}

class Variable{
    public int iv;
    public static int cv;

    void method(){
        int lv =0;
    }
}