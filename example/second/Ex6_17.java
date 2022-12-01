package example.second;

public class Ex6_17 {
    /**
     * 생성자 : 인스턴스가 생성될 때마다 호출되는 '인스턴스 초기화 메서드'
     *      인스턴스 생성시 수행할 작업(iv 초기화)에 사용
     *      이름이 클래스 이름과 같아야 한다.
     *      리턴값이 없다.(void 안붙임)
     *      모든 클래스는 반드시 생성자를 가져야 한다.
     *
     * class Card{
     *     ...
     *     Card(){ // 매개변수 없는 생성자
     *         // 인스턴스 초기화 작업
     *     }
     *     Card(String kind, int number){ // 매개변수 있는 생성자
     *         // 인스턴스 초기화 작업
     *     }
     * }
     *
     * 기본 생성자
     *  - 매개변수가 없는 생성자
     *  - 생성자가 하나도 없을 때만, 컴파일러가 자동 추가
     *
     * 클래스 이름(){} // 기본생성자
     *
     */
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
        Data_2 d2 = new Data_2(10);
        Data_2 d3 = new Data_2();
    }
}

class Data_1{
    int value;
}

class Data_2{
    int value;

    Data_2(){}
    Data_2(int x){  // 배개변수가 있는 생성자
        value = x;
    }
}

class Car{
    String color;   // 색상
    String gearType;// 변속기 종류 - auto(자동), manual(수동)
    int door;       // 문의 개수

    Car(){}
    Car(String c, String g, int d){ // 매개변수가 있는 생성자
        color = c;
        gearType = g;
        door = d;
    }
}
