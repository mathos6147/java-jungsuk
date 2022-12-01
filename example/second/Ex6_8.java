package example.second;

public class Ex6_8 {
    /**
     *  선언 위치
     *  영역 - 클래스 영역 : iv, cv
     *      - 메서드 영역 : lv
     *
     *  포커 공통 영역 : 높이, 폭
     *      개별 영역 : 숫자, 무늬
     *
     */

    public static void main(String[] args) {
        Card c = new Card();
        c.kind = "Heart";
        c.number = 5;
        c.width = 200;  //권장하지 않음
        c.height = 300; //권장하지 않음

        Card.width = 250;   //클래스 이름으로 만드는게 좋음
        Card.height = 200;  //클래스 이름으로 만드는게 좋음

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 ("+ c1.width + ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 ("+ c2.width + ", " + c2.height + ")");
    }
}

class Card{
    String kind;            //무늬
    int number;             //숫자

    static int width = 100; //폭
    static int height = 250;//높이
}