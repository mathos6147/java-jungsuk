package example.first;

public class Ex5_10 {
    public static void main(String[] args) {
        /**
         * String클래스 = char[] + 메서드(기능)
         * String 클래스는 내용 변경 불가능
         */

        String str = "ABCDE";
        char ch = str.charAt(3);
        System.out.println(ch);
        System.out.println(str.substring(0,3));
        System.out.println(str.substring(1));
    }
}
