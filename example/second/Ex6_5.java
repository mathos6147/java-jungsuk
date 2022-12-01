package example.second;

public class Ex6_5 {
    /**
     * 클래스 : 설계도 , 데이터 + 함수 , 사용자 정의 타입
     *
     * ------------------------------------------------------------------
     * 클래스 == 데이터 + 함수
     *
     * 1. 변수 : 하나의 데이터를 저장할 수 있는 공간
     * 2. 배열 : 같은 종류의 여러 데이터를 하나로 저장할 수 있는 공간
     * 3. 구조체 : 서로 관련된 여러 데이터(종류 관계X)를 하나로 저장할 수 있는 공간
     * 4. 클래스 : 데이터와 함수의 결함(구조체 + 함수), 서로 관련 있는 변수와 함수를 묶음
     * ------------------------------------------------------------------
     *
     * ------------------------------------------------------------------
     * 사용자 정의 타입 - 원하는 타입을 직접 만들 수 있다.
     *
     * int hour;
     * int minute;
     * int second;
     *
     * int hour1, hour2, hour3;
     * int minute1, minute2, minute3;
     * int second1, second2, second3;
     *
     * int[] hour = new int[3];
     * int[] minute = new int[3];
     * int[] second = new int[3];
     *
     * class Time{
     *     int hour;
     *     int minute;
     *     int second;
     * }
     *
     * Time t = new Time();
     *
     * Time t1 = new Time();
     * Time t2 = new Time();
     * Time t3 = new Time();
     *
     * Time[] t = new Time[3];
     * t[0] = new Time();
     * t[1] = new Time();
     * t[2] = new Time();
     */
}
