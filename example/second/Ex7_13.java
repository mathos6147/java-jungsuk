package example.second;

public class Ex7_13 {
    /**
     * instanceof 연산자
     *  - 참조변수의 형변환 가능여부 확인에 사용된다. 가능하변 true 변환
     *  - 형변환 전에 반드시 instanceof 로 확인해야함.
     *  - 조상들에 대해서도 true 가 나온다.
     *
     *  void doWork(Car c){
     *      if(c instanceof FireEngine) {   // 형변환이 가능한지 확인
     *          //...                       // 형변환
     *      }
     *      if(c instanceof Ambulance){
     *          //...
     *      }
     *  }
     *
     * Q. 참조변수의 형변환은 왜 하나요?
     * A. 참조변수(리모콘)을 변경함으로써 사용할 수 있는 멤버의 갯수를 조절하기 위해서
     *
     * Q. instanceof 연산자는 언제 사용하나요?
     * A. 참조 변수를 형변환 하기 전에 형변환 가능 여부를 확인할 때 사용한다.
     */

    public static void main(String[] args) {
    }
}
