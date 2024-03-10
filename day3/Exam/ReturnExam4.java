package day3.Exam;

public class ReturnExam4 {
    public static void main(String[] args) {
        // 1 부터 n까지 수 중 짝수인 것만 출력
        printEven(10); // 출력: 2 4 6 8 10
        printEven(20); // 출력: 2 4 6 8 10 12 14 16 18 20
        printEven(5); // 출력: 2 4

    }


    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    // boolean 함수는 true 와 false 로 쓰일때 쓰임
    // isEven에 대한 true / false 를 구해야하므로 if 절을 쓴다.
    // 짝수이기 때문에 나머지 기호인 % 를 쓰고 나누어 떨어지면 true 안떨어지면 false를 쓴다.
    // 반환해야하므로 return 함수를 쓴다.

    public static void printEven(int n) {
        for (int i = 1; i <= n; i++) {
            boolean b = isEven(i);
            if (b) {
                System.out.println(i);
            }
        }
    }
    // 배열을 해야하므로 for(){}함수를 쓰고 ()안에 배열하는 값을 적는다.
    // 위에서 boolean 함수를 썼으므로 boolean 의 값을 b라고 가정한다.
    // boolean b = isEven(i);  >>> isEven(i)가 true 면 b도 true가 된다.
    // b에는 true 와 false가 써있다.
    // b가 true 면 i를 넣은 값이 실행되고 함수가 나열된다.


}




//         isEven 메서드를 이용.

