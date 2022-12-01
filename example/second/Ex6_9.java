package example.second;

public class Ex6_9 {
    /**
     * 메서드란?
     * 1. 문장들을 묶어놓은것
     *  - 작업단위로 문장들을 묶어서 이름 붙인 것.
     * 같은 작업을 하는 코드들을 모아서 하나의 메서드로 만들어서 코드의 중복을 줄인다.
     *
     * 2. 값(입력)을 받아서 처리하고, 결과를 반환(출력)
     *
     * 메서드는 클래스안에 존재해야하고, 함수는 제약이 없다.
     * 메서드랑 함수는 같다고 생각할 수 있다.
     *
     * 장점 : 코드의 중복을 줄인다, 코드의 관리가 쉽다, 코드의 재사용성, 코드가 간결해지고 사용하기 쉬워진다.
     *
     * !!! 하나의 메서드는 한가지 기능만 수행하도록 작성한다.
     *
     * 메서드 = 선언부 + 구현부
     * 반환타입 메서드이름 (타입 변수명, 타입 변수명 ......) -> 선언부
     * {
     *     // 메서드 호출시 수행될 코드                 -> 구현부
     * }
     */
    public static void main(String[] args) {

    }

    int add(int x, int y){
        int result = x+y;
        return result;
    }

    int multiply(int x, int y){
        int result = x*y;
        return result;
    }
}


