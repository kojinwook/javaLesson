package day3.Lesson;

public class Return {
    public static void plus(int num1, int num2){
        System.out.println(num1 +num2);
    }
    // 원의 넓이 : 반지름 *반지름 * 3.14

    public static double circleArea(int radius){
//        System.out.println(radius * radius * 3.14);
//          radius * radius *3.14 를 밖으로 빼내야 하므로 return을 쓰고 void 함수는 쓰면 없어지는 함수 이므로
//          void 가 아닌 retrun 하는 값에 맞는 함수를 쓴다.
//          3.14는 소수이므로 double 함수를 쓴다.
//          즉 retrun 하는 값은 radius * radius * 3.14 이다.
       return radius * radius * 3.14; // 원의 넓이를 반환
    }
    public static void main(String[] args) {
    plus(10,20);

    double area1 = circleArea(5); // 반 지름이 5인 원의 넓이
        /// radius에 5가 들어가므로 5 * 5 * 3.14로 계산한다.
        // area1 = 5 * 5 * 3.14 이다.
    double area2 = circleArea(10); // 반지름이 10인 원의 넓이
        // area2 = 10 *10 * 3.14
        System.out.println(area1);
        System.out.println("반지름이 5인 원의 넓이 : " +area1);
        System.out.println("반지름이 5인 원의 넓이 : " +area2);

        // 반지름이 5인 원의 넓이를 3을 나눈값


        //반지름이 5인 원의 넓이 / 3
        System.out.println(area1 / 3);

        //반지름이 5인 원의 넓이의 2배
        System.out.println(area2 * 2);

        // 함수끼리는 서로 호출하고 호출 당하는 관계
        // 함수가 자신을 호출한 쪽으로 값을 전달하는 것이 출력(리턴값)
        // 함수의 결과값을 이용해 2차 작업을 하기 위해서는 함수의 전달값을받아서 사용할  수 있어야 한다.
        //  함수의 전달값은 return 을 이용해 전달한다.
    }
}
