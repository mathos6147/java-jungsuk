package example.second;

public class Ex6_15 {
    /**
     * static 메서드 : 객체생성없이 '클래스이름.메서드이름()'으로 호출
     *              인스턴스 멤버(iv,im)와 관련없는 작업을 하는 메서드
     *              메서드 내에서 인스턴스 변수(iv)사용 불가
     *
     * 인스턴스 메서드 : 인스턴스 생성 후, '참조변수.메서드이름()'으로 호출
     *             인스턴스 멤버(iv,im)와 관련된 작업을 하는 메서드
     *             메서드 내에서 인스턴스 변수(iv) 사용가능
     *
     * static 은 속성 중에서 공통 속성에 static 을 붙인다.
     * 인스턴스 멤버(iv,im)을 사용하지 않는 메서드에 static 을 붙인다.
     * 메서드 = 명령문 집합
     */

    public static void main(String[] args) {
        System.out.println(MyMath2.add(200,100));   // 클래스 메서드 호출 클래스이름.메서드이름()
        MyMath2 mm = new MyMath2();
        mm.a = 200;
        mm.b = 200;
        System.out.println(mm.add());   // 인스턴스 메서드 호출 참조변수.메서드이름()
    }
}

class MyMath2{
    long a,b;   // 인스턴스 변수

    long add(){ // 인스턴스 메서드 iv를 사용
        return a+b;
    }

    static long add(long a, long b){    // 클래스 메서드(static 메서드)
        return a+b; // lv(지역변수) a,b 사용
    }
}

class TestClass{
    int iv;
    static int cv;

    void instanceMethod(){      // 인스턴스 메서드 -> 객체 생성후 호출 가능
        System.out.println(iv); // 인스턴스 변수 사용 가능
        System.out.println(cv); // 클래스 변수 사용 가능
    }

    /*
    static void staticMethod(){ // static 메서드 -> 항상 호출 가능
        System.out.println(iv); // 에러!!! -> 인스턴스 변수 사용 불가 >> 객체 생성시에만 인스턴스 변수 사용 가능함
        System.out.println(cv); // 클래스 변수 사용 가능
    }

    static void staticMethod2(){ // static 메서드 -> 항상 호출 가능
        instanceMethod();        // 에러!! 인스턴스 메서드 호출 불가 >> 객체 생성시에만 인스턴스 메서드 호출 가능함
        staticMethod();          // static 메서드 호출 가능
    }
*/
    /**
     * static 메서드가 instance 메서드 호출 불가!
     *
     * Q. static 메서드는 static 메서드 호출 가능?
     * A. 네
     *
     * Q. static 메서드는 인스턴스 변수 사용 가능?
     * A. 아니요
     *
     * Q. static 메서드는 인스턴스 메서드 호출 가능?
     * A. 아니요
     *
     * Q. static 메서드는 왜 인스턴스 멤버를 쓸 수 없나요?
     * A. static 메서드는 객체가 생성되지 않아도 사용가능하지만, static 메서드 호출시에 객체가 생성되어 있지 않다면 인스턴스 멤버를 사용할 수 없어서.
     */
}