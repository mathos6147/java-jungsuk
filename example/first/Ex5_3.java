package example.first;

public class Ex5_3 {
    public static void main(String[] args) {
        int sum=0;
        float average = 0f;

        int[] scores = {100,88,100,100,90};
        int max = scores[0];
        int min = scores[0];

        for(int score: scores){
            sum += score;
            if(score > max)
                max = score;
            if(score < min)
                min = score;
        }
        average = sum / scores.length;
        System.out.println(average);
        average = sum / (float)scores.length;
        System.out.println(average);
        System.out.println(min);
        System.out.println(max);
    }
}
