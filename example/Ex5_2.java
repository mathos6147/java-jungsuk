package example;

import java.util.Arrays;

public class Ex5_2 {
    public static void main(String[] args) {
        /**
         * int [] iarr = {1,2,3}
         * System.out.println(iarr) -> [I@38234723bb 와 같은 형식의 문자열 출력
         * char [] arr = {'a','b','c'}
         * System.out.println(arr) -> abc 출력
         *
         */
        int[] iArr1 = {100, 95, 80, 70, 60};
        int[] iArr2 = new int[10];
        System.out.println(iArr1); // [I@1cd072a9 출력
        System.out.println(Arrays.toString(iArr1)); // [100,95,80,70,60] 출

        for(int i=0; i<10; i++){
            iArr2[i] = (int)(Math.random()*10) +1;
        }
        System.out.println(Arrays.toString(iArr2));
        System.out.println(iArr1);
        System.out.println(iArr2);
    }
}
