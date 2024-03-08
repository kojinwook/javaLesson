package day3;

public class Parameter {
    // 함주 정의 -> 변수
    public static void plus(int num1, int num2){ // 매개변수
        System.out.println(num1 +num2);
    }
    public  static void mutiply(int num1, int num2){
        System.out.println(num1 * num2);}


    public static void main(String[] args) {
        // 함수 호출 -> 값(인자, argument)
        plus(10, 20); // 10 +20 걀과를 출력

        plus(30, 40);//30 + 40 결과를 출력

        mutiply(10, 20); // 10 *  20 값 출력
        mutiply(5,5); // 5 * 5 값 출력


    }


}
