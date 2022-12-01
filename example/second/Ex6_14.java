package example.second;

public class Ex6_14 {
    /**
     * 참조형 매개변수
     */
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);

        Data2 d2 = Copy(d);
        d2.x = 100;
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }

    static void change(Data2 d){    // 참조형 배개변수
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }

    static Data2 Copy(Data2 d){     // 참조형 반환 타입
        Data2 tmp = new Data2();
         tmp.x = d.x;
        return tmp;
    }
}

class Data2{
    int x;
}
