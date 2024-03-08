package day3;

public class ReturnExam3 {
    public static void main(String[] args) {
        //0은 양수로 보겠습니다.
        int no = -1;

        if (isNegative(no)) {

            System.out.println("음수입니다.");

        } else {

            System.out.println("양수입니다.");

        }
    }
//         no 값을 바꿔가면서 테스트해보세요.

        public static boolean isNegative(int n){
            if(n<0){return true;}return false;}
    // boolean 함수는 true 와 false 를 쓸때 사용
    // if()가 참이면 true를 리턴하고 거짓이면 false를 리턴한다.
    // n이 0보다 작을 경우 true 를 리턴하고 if(true){""} = true 이므로 ""을 입력한다.
    // false일 경우 false 이므로 else 값을 입력한다.


}
