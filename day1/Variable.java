package day1;

public class Variable {
    public static void main(String[] args) {
        // 변수
        // 변수는 데이터를 저장하는 공간(그릇)

        //변수 선언
        //변수타입 변수명;

        //숫자형 변수선언
        //int = 정수
        int number;

        // 변수에 값 저장
        number = 100; // 변수가 왼쪽, 저장대상이 오른쪽

        // 40 = number; // 안됨

        //   int number2;
        //   number2 = "고진욱"; // 숫자 변수에 문자를 저장하려고 하면 안됨

        // String = 자바에서 문자열을 의미
        String str;
        str = "고진욱";
        System.out.println(str);


        // 변수에 저장되어 있는 값을 사용
        // 변수명을 값처럼 사용

        System.out.println(number);
        System.out.println(number);
        System.out.println(number);

        String name;
        name = "홍길동";

        System.out.println(name);
        System.out.println(name);
        System.out.println(name);

        int age;
        age = 22;

        String name2;
        name2 = "고진욱";

        System.out.println("안녕하세요." + age + "살" + name2 +"입니다.");
        System.out.println("안녕하세요." + age + "살" + name2 +"입니다.");

        // 변수 주의사항
        // 변수명은 중복되지 않도록 지어야한다.
        // 변수명은 숫자로 시작하면 안된다.
        // 변수명은 특수문자로 시작하면 안된다.
        // 변수는 재활용 가능하다.

        int a;
        a = 10;
        System.out.println(a);

        // int a; 를 또쓰면 안된다.
        a = 20;
        System.out.println(a);


    }
}
