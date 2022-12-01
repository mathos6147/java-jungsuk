package example.second;

public class Ex6_10 {
    /**
     *  메서드 호출(값1, 값2, 값3 ...);
     *
     *  메서드 실행 흐름
     *
     *  1. 객체 생성
     *  2. 메서드 호출
     *  3. 호출한 메서드(main 메서드)로 돌아와서 작업 결과로 바뀌고 문장이 실행됨
     */

    public static void main(String[] args) {
        print99danAll();
        int result = add(3,5);
        System.out.println(result);

        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L,3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);

        System.out.println("max(5L,3L) = " + mm.max(5,3));
        System.out.println("add(5L,3L) = " + result1);
        System.out.println("subtract(5L,3L) = " + result2);
        System.out.println("multiply(5L,3L) = " + result3);
        System.out.println("divide(5L,3L) = " + result4);
    }

    static void print99danAll(){
        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                System.out.println(i +"x" + j + "= " + multiply(i,j));
            }
        }
    }

    static int add(int x, int y){
        int result = x+y;
        return result;
    }

    static int multiply(int x, int y){
        int result = x*y;
        return result;
    }
}

class MyMath{
    long add(long a, long b){
        long result = a+b;
        return result;
    }
    long max(long a, long b){
        return a> b ? a : b;
    }
    long subtract(long a, long b){
        return a-b;
    }
    long multiply(long a, long b){
        return a*b;
    }
    double divide(double a, double b){
        return a/b;
    }
}