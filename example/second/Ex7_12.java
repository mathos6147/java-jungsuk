package example.second;

public class Ex7_12 {
    /**
     * 참조 변수의 형변환
     *  - 사용할 수 있는 멤버의 갯수를 조절하는 것(값이 변화되는게 아님)
     *  - 조상, 자손 관계의 참조 변수는 서로 형변환 가능하다.(형제 관계는 없음)
     *
     */

    public static void main(String[] args) {
        FireEngine f = new FireEngine();        // f,c,f2 모두 하나의 FireEngine 인스턴스의 주소를 가리키고 있음
        Car6 c = (Car6)f;
        FireEngine f2 = (FireEngine)c;

        ((FireEngine) c).water();
        c.drive();
        f2.water();

        Car6 car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
        //car.water(); Car6에는 water()가 정의되어 있지 않아서 사용하지 못한다.
        fe2 = (FireEngine) car;
        fe2.water();

        Car6 car2 = new Car6();
        FireEngine fe1 = (FireEngine) car2;
        fe1.water();  // 컴파일은 되는데 오류가 난다.
    }
}

class Car6{
      String color;
      int door;

              void drive(){
          System.out.println("Drive~~");
      }

              void stop(){
          System.out.println("Stop!");
      }
}

class FireEngine extends Car6{
    void water(){
        System.out.println("Water!!");
    }
}