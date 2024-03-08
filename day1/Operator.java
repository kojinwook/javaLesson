package day1;

public class Operator {
    public static void main(String[] args) {
        // 연산자

        // 산술연산자
        // +, -, *, / , %(나머지)
        System.out.println(10 + 5);
        System.out.println(10 - 4);
        System.out.println(10 * 5);
        System.out.println(10 / 3); // 정수와  정수의 계산 결과는 정수
        System.out.println(10.0 / 3.0); //실수로 계산하려면 실수로 나누기
        System.out.println(10 % 3);

        // 비교연산자
        // >, <, >=, <=, ==(같음), !=(다름)
        // true, false = 논리값(boolean)으로 결과가 나온다
        System.out.println(10 > 5);
        System.out.println(10 < 5);

        System.out.println(5 >= 5);
        System.out.println(100 <= 50);

        System.out.println(100 == 100);
        System.out.println(100 != 100);

        // 논리연산자
        // 정수 : int , 실수(소수) : double, 문장 : String


    }
}
