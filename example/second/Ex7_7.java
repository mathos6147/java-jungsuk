package example.second;

public class Ex7_7 {
    /**
     * import 문
     *  - 클래스를 사용할 때 패키지이름을 생략할 수 있다.
     *  - 컴파일러에게 클래스가 속한 패키지를 알려준다.
     *  - java.lang 패키지의 클래스는 import 하지 않고도 사용 가능하다.
     *      String, System, ... 등이 java.lang 에 들어있음
     *  - 패키지문과 클래스 선언의 사이에 선언한다.
     *  - import 문은 컴파일 시에 처리되므로 프로그램의 성능에 영향 없음.
     *  - import java.*; ---> java 패키지의 모든 클래스 (패키지는 포함 안됨)
     *  - 이름이 같은 클래스가 속한 두 패키지를 import 할 때는 클래스 앞에 패키지명을 붙여줘야 한다.
     *
     * import 문의 선언
     *  import 패키지명.클래스명;
     *  import 패키지면.*;   <--- 모든 클래스
     *
     * static import 문
     *  - static 멤버를 사용할 때 클래스 이름을 생략할 수 있게 해준다.
     *
     *  import static java.lang.Integer.*; // Integer 클래스의 모든 static 메서드
     */
}
