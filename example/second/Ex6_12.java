package example.second;

public class Ex6_12 {
    /**
     * 스택 : 밑이 막힌 상자. 위에 차곡차곡 쌓임.
     * 호출 스택 : 메서드 수행에 필요한 메모리가 제공되는 공간,
     *        메서드가 호출되면 호출스택에 메모리 할당, 종료되면 해제
     *        아래있는 메서드가 위의 메서드를 호출한것
     *        맨 위의 메서드 하나만 실행 중, 나머지는 대기중임
     */
    public static void main(String[] args) {
        System.out.println("hello");
    }

    /**
     *                                 println (실행)
     *  비어있음   ---->  main  ----->   main    (대기) --->    main    ---->   프로그램 종료
     *
     */
}
