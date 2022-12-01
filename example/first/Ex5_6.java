package example.first;

import java.util.Arrays;

public class Ex5_6 {
    public static void main(String[] args) {
        String[] name = new String[3];
        name[0] = "Kim";
        name[1] = "Park";
        name[2] = "Lee";

        String[] strArr = {"가위", "바위", "보"};
        System.out.println(Arrays.toString(strArr));

        for (int i = 0; i < 10; i++) {
            System.out.println(strArr[(int)(Math.random()*3)]);
        }
    }
}
