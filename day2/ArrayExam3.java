package day2;

public class ArrayExam3 {
    public static void main(String[] args) {
        // 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.
        int[] num = {10, 20, 30, 40, 50};
                for(int i=num.length-1;i>=0; i--){
                    System.out.println(num[i]);
                }
    }
}
