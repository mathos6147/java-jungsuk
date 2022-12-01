package example.second;

public class Ex6_19 {
    /**
     * 변수의 초기화
     *
     * 지역 변수(lv)는 수동 초기화를 꼭 해야함! (사용하기 전에 꼭!!!)
     * 멤버변수(iv, cv)는 자동 초기화된다.
     * 자동 초기화 될때는 0으로 초기화 된다고 생각해도 됨
     *
     * 1.명시적 초기화(=) 대입 연산자
     * class Car{
     *     int door = 4;                // 기본형 변수의 초기화
     *     Engine e = new Engine();     // 참조형 변수의 초기화 * 객체를 생성해서 넣어줘야함
     * }
     *
     * 2.초기화 블럭   ----> 복잡한 초기화 여러 문장 넣기
     *  - 인스턴스 초기화 블럭 : {}
     *  - 클래스 초기화 블럭 : static {}
     *
     * 3.생성자       ----> 복잡합 초기화, iv 초기화
     *  Car(String color, String gearType, int door){
     *      this.color = color;
     *      this.gearType = gearType;
     *      this.door = door;
     *  }
     *
     * 멤버변수(cv,iv)의 초기화 - static {}
     *  1. 명시적 초기화(=)
     *  2. 초기화 블럭 - {}, static {}
     *  3. 생성자(iv 초기화)
     *
     *  class StaticBlockTest{
     *      static int[] arr = new int[10]; // 명시적 초기화, 간단 초기화
     *
     *      static{
     *          for(int i=0; i<arr.length; i++){    // 복잡 초기화, 초기화 블럭 - 배열 arr을 난수로 채운다.
     *              arr[i] = (int)(Math.random()*10)+1;
     *          }
     *      }
     *  }
     *
     * 클래스 변수 초기화 시점 : 클래스가 처음 메모리에 올라갈때 딱 한번
     * 인스턴스 변수 초기화 시점 : 인스턴스가 생성될 때 마다
     *
     * 초기화 순서
     *  1. cv(클래스 변수) -> iv(인스턴스 변수)
     *  2. 자동 -> 간단 -> 복잡
     */
}

class InitTest{
    static int cv =1;       // 명시적 초기화
    int iv = 1;             // 명시적 초기화

    static {cv =2;}         // 클래스 초기화 블럭
    {iv =2;}                // 인스턴스 초기화 블럭

    InitTest(){ // 생성자     // 복잡 초기화
        iv =3;
    }

    void method1(){
        int i;      //지역변수
//        int j = i;  //에러 지역변수를 초기화하지 않고 사용
    }
}
