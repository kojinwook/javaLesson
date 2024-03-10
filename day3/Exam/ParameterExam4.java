package day3.Exam;
public class ParameterExam4 {


    public static void main(String[] args) {
        // 매개변수는 인사말 언어를 의미
        // 1은 한국어, 2는 영어, 3은 프랑스어

        greeting1(2);
        // 하이~

        greeting1(3);
        // 봉쥬

        greeting1(1);
        // 안녕하세요


        // 첫번째는 언어, 두번째는 횟수를 의미

        greeting2(1, 3);
        // 안녕하세요
        // 안녕하세요
        // 안녕하세요

        greeting2(2, 5);
        // 하이~
        // 하이~
        // 하이~
        // 하이~
        // 하이~

        greeting2(3,7);
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
    }

    public static void greeting1(int i) {
        if (i == 1) {
            System.out.println("안녕하세요");
        } else if (i == 2) {
            System.out.println("하이~");
        } else {
            System.out.println("봉쥬");
        }
    }
    // public static void greeting1을 따로 만들어서 greeting1의 값을 먼저 구함

    public static void greeting2(int i, int j) {
        for (int n = 0; n < j; n++) {
            greeting1(i);
        }
    }
    // public static void greeting2의 값을 구할때는 ( n, m)을 이용하여
    // n = greeting1 의 값을 인용해서 씀


}