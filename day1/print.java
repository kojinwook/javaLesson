package day1;

public class print {
    public static void main(String[] args) {
        System.out.println ("안녕하세요.반갑습니다");

        // \n은 줄바꿈
        System.out.println("안녕하세요 \n반갑습니다");

        // 문자 합치기 (+)
        System.out.println("안녕하세요."+"고진욱입니다.");

        // 숫자 더하기(산술연산)
        System.out.println(100 + 200);

        // 숫자에 절대로 "" 하지않기
        System.out.println("100"); //문자
        System.out.println(100); // 숫자

        // 숫자와 문자는 정확히 구별해서 사용
        System.out.println("100" + "200");
        System.out.println(100 + 200);

        // 문자 + 숫자 = 숫자를 문자화해서 붙임
        System.out.println("100" + 200);

        //출력문을 이용해 더하기 식 표현하기
        // + 연산자가 여러번 나오면 왼쪽부터 순차적으로 연산
        System.out.println("100 + 200 =" + (100 + 200));

        // 출력문을 하나만 사용하여 구구단 2단 표현
        System.out.println("2 x 1 =" +(2*1) + "\n2 x 2 =" +(2*2)+ "\n2 x 9 ="+(2*9) );


    }
}
