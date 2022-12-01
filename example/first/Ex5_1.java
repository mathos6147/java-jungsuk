package example.first;

public class Ex5_1 {

    /**
     * 왜 배열을 못 바꾸는가?
     * 배열을 만들때 이어진 주소를 배정하므로 다음 주소에 뭐가 있는지에 대한 정보는 없음.
     * 부족하면 어떻게 하는가?
     * 새로 만들고 나서 새로 만든거에 다시 저장해야함.
     */
    public static void main(String[] args){
        // index범위 : 0~9
        int[] arr = new int[9];
        System.out.println("arr.lenth="+arr.length);

        for(int i=0; i<9; i++){
            System.out.println("arr["+i+"]=" + arr[i]);
        }
    }
}
