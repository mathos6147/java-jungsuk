package example.second;

public class Ex6_16 {
    /**
     * 오버로딩 : 한 클래스 안에 같은 이름의 메서드 여러 개 정의하는 것
     * ex) void println(), void println(char x), void println(boolean x) ...
     *
     * 오버로딩이 성립하기 위한 조건
     * 1. 메서드 이름이 같아야 한다.
     * 2. 매개변수의 개수, 타입이 달라야 한다
     * 3. 반환 타입은 영향 없다.
     *
     * int add(int a, int b){return a+b;}
     * int add(int x, int y){return x+y;}
     * ----> 메서드 중복 정의
     *
     * int add(int a, int b){return a+b;}
     * long add(int a, int b){return a+b;}
     * ----> 메서드 중복 정의
     *
     * long add(int a, long b){return a+b;}
     * long add(long a, int b){return a+b;}
     * ----> ambiguous (모호함) 에러 남
     */

    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        System.out.println(mm.add(3,3));
        System.out.println(mm.add(3L,3));
        System.out.println(mm.add(3,3L));
        System.out.println(mm.add(3L,3L));
        int[] a = {100, 200, 300};
        System.out.println(mm.add(a));
    }
}

class MyMath3{
    int add(int a, int b){
        System.out.println("int add(int a, int b) - ");
        return a+b;
    }

    long add(long a, long b){
        System.out.println("long add(long a, long b) - ");
        return a+b;
    }

    int add(int[] a){
        System.out.println("int add(int[] a) - ");
        int result =0;
        for(int i=0; i<a.length; i++)
            result += a[i];
        return result;
    }
}
