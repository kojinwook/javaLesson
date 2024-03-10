package day2.Exam;

public class ArrayExam1 {
    public static void main(String[] args) {
        // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
      //  int[]arr = {}; >>  배열선언
//      int[]arr={10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
      int[]arr2 = new int[10];
      for(int i = 0; i <10; i++){arr2[i]= (i + 1) * 10;
      System.out.println(arr2[i]);}

    }
}















//        int[]arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        for(int i= 0; i< arr.length; i++){ System.out.println(arr[i]);}

//        정답
//        int[] arr2 = new int[10];
//
//        for(int i = 0; i < 10 ; i++) {
//            arr2[i] = (i + 1) * 10;
//        }
//
//        for(int i = 0; i < 10; i++) {
//            System.out.println(arr2[i]);
//        }