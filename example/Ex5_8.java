package example;

public class Ex5_8 {
    public static void main(String[] args) {
        int[][] score = new int[4][3];
        score[0][0] = 100;
        System.out.println(score[0][0]);
        int[][] arr = {
                {100,100,100},
                {20,20,20},
                {30,30,30},
                {40,40,40},
                {50,50,50}
        };

        int korT =0, engT =0, mathT =0;

        for(int i=0; i<arr.length; i++){
            int sum =0;
            float avg = 0.0f;

            korT += arr[i][0];
            engT += arr[i][1];
            mathT += arr[i][2];
            System.out.print(i+1);

            for(int j=0; j<arr[0].length; j++){
                sum += arr[i][j];
                System.out.printf("%5d", arr[i][j]);
            }

            avg = sum/(float)arr[i].length;
            System.out.println(" " + sum +" " +avg);
        }
    }
}
