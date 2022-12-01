package example.second;

public class Ex6_11 {
    /**
     * Return 문
     * 실행중인 메서드를 종료하고 호출한 곳으로 되돌아간다.
     */

    public static void main(String[] args) {
        printGugudan(2);
        printGugudan(11);
    }

    static void printGugudan(int dan){
        if(!(2<=dan && 9>=dan)) return;
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + "*" + i + "= " + dan*i);
        }
    }
}
