package day2.Exam;

public class ArrayExam4 {
    public static void main(String[] args) {
        // 배열 안의 숫자들의 합을 구해주세요.

        int[] arr = {10, 20, 30, 40, 50};
        int sum =0;
        for(int i= 0; i<arr.length; i++){ sum += arr[i];}
            System.out.println(sum);
        // 계좌돈 합치기랑 똑같이 생각하면 됨

		/*
		// 아래 4줄은 위 1줄과 같은 의미 입니다.
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
    arr[3] = 40;
    arr[4] = 50;
		*/
    }
}
