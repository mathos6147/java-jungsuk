package example.second;

public class Ex7_11 {
    /**
     * 다형성
     *  - 여러가지 형태를 가질 수 있는 능력
     *  - 조상 타입 참조 변수로 자손 타입 객체를 다루는 것
     *  - 객체와 참조 변수의 타입이 일치할 떄와 일치하지 않을때의 차이?
     *   -- 스마트 티비는 버튼 7개, 티비는 버튼 5개
     *   -- 티비 리모콘으로 스마트 티비의 7개 멤버를 다 쓰는게 아닌 5개 멤버 즉 일부만 사용하는 방식으로 사용 가능
     *  - 자손 타입의 참조변수로 조상 타입의 객체를 가리킬 수 없다.
     *
     * Tv t = new SmartTv(); // 타입 불일치 ----> 다형성
     * SmartTv s = new Tv(); // 에러!, 허용 안됨, Tv 에서 사용할 수 없는 버튼을 누르면 에러가 나기 떄문에
     *
     * Q. 참조 변수의 타입은 인스턴스의 타입과 반드시 일치해야 하나요?
     * A. 아니요. 일치하는 것이 일반적이지만, 일치하지 않을 수도 있습니다.
     *
     * Q. 참조변수가 조상타입일 때와 자손 타입일 떄의 차이는?
     * A. 참조변수로 사용 가능한 멤버의 갯수가 달라집니다.
     *
     * Q. 자손 타입의 참조변수로 조상 타입의 객체를 가리킬 수 있나요?
     * A. 아니요. 허용되지 않습니다.
     */
}