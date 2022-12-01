package example.second;

public class Ex6_18 {
    /**
     * 생성자 this()
     *  - 생성자에서 다른 생성자 호출할 때 사용
     *  - 다른 생성자 호출시 첫 줄에서만 사용 가능
     *
     * 생성자 this() != 참조 변수 this
     * ------> 완전히 다른거임
     *
     * 참조 변수 this
     *  - 인스턴스 자신을 가리키는 참조변수
     *  - 인스턴스 메서드(생성자 포함)에서 사용가능
     *  - static 메서드 에서는 사용 불가능.
     *  - 지역변수(lv)와 인스턴스 변수(iv)를 구별할 때 사용
     */
}

class Car2 {
    String color;
    String gearType;
    int door;

    Car2(){
        this("white", "auto", 4); // good code
        /**
         * color = "white";
         * gearType = "auto";
         * door = 4;
         * 와 동일해서 코드의 중복을 제거한 코드임. 위에 코드가
         */
    }

    Car2(String color){
        this(color, "auto", 4);
    }

    Car2(String color, String gearType, int door){
        // 참조 변수 this iv와 lv 구별하기 위한 This 사용
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}