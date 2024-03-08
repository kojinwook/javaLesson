package day2;

public class DoubleLoopExam1 {
    public static void main(String[] args) {
        // 문제 : 구구단 작성
// 조건 : 짝수번째만 곱하기
/* 출력예시 :

  2 * 2 = 4
  2 * 4 = 8
  2 * 6 = 12
  2 * 8 = 16

  ...

  9단까지 이런식으로 나오면 됩니다.

*/
        int dan;
        for(dan = 2; dan <10; dan +=1){for(int i =2; i <10; i+=2 ){
            System.out.println(dan +"*"+ i+ "="+ (dan*i));}}

        // 정답
//        for(int dan = 2; dan < 10; dan++){for(int i = 1; i< 10; i++){if(i %2 ==0){
//            System.out.println(dan +"*"+ i+"="+dan*i);
//        }}}
    }
}
