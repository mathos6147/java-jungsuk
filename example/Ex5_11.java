package example;

import java.util.Arrays;

public class Ex5_11 {
    public static void main(String[] args) {
        /**
         * Arrays => 클래스
         * 배열을 다루는데 유용한 메서드들을 모아놓음
         * toString() -> 배열에 저장된 값을 문자열로 반환 (1차원 배열)
         * deepToString() -> 배열 안으로 들어가서 배열을 반환 (다차원 배열)
         * equals() -> 두 배열을 비교할때 사용 (1차원 배열)
         * deepEquals() -> 두 배열을 비교할때 사용 (다차원 배열)
         * copyOf(배열, 복사할 요소의 갯수) -> 배열을 복사할때 사용
         * copyOfRange(배열, from, to) -> 배열을 from 부터 to 까지 복사할 때 사용
         * sort() -> 배열을 정렬해줌
         */

        int[] arr = {0,3,1,4,2};
        int[][] arr2D = {{11,12}, {21,22}};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr2D));

        String[][] str2D = {{"aaa","bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = {{"aaa","bbb"}, {"AAA","CCC"}};

        System.out.println(Arrays.deepEquals(str2D2,str2D));

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
