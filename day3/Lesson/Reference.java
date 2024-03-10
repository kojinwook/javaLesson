package day3.Lesson;

import day3.Lesson.Person;

public class Reference {
    public static void main(String[] args) {
        Person p1 =     new Person(); //  객체가 힙 메모리에 생성, 객체의 참조값에 저장
        Person p2 =     new Person();

        System.out.println(p1);  // 주민번호 같은 존재 (객체를 8 바이트로 묶어서 스택에 참조값으로 저장)
        System.out.println(p2);

        // 사람 복사
        p1.name = "홍길동";
        p1. age = 20;
        p1.home = "서울";

        System.out.println(p1.name);

        //  사람 복사
        Person p3 = p1;  // p1을 p3에 저장  (참조값을 복사한것)
        System.out.println(p3.name);

        //  홍길동은 2명이 된걸까? X

        p3.name = "이순신";

        System.out.println(p3.name);
        System.out.println(p1.name); // p3과 p1 은 동일하기 때문에

        // 손흥민을 2명 만들어주세요.(단, 코드의 중복은 없어야 합니다.)
        Person a1 = new Person();
        Person a2 = new Person();

        a1.name = "손흥민";
        a1.age = 30;
        a1.home = "서울";




        System.out.println(a1);

         a2.name =a1.name;
         a2.age = a1.age;
         a2.home = a1.home;

        a2.name = "이영표";
        System.out.println(a1.name);
        System.out.println(a2.name);

        // 객체의 복사
        // 참조값의 복사 -> 얕은 복사
        // 객체값의 복사 -> 깊은 복사

    }
}
// 클래스와 객체 내용정리
//    모든 변수는 메모리에 저장된다.
//    int 변수는 4바이트이다.
//    변수에는 오직 8바이트 이하의 값만 넣을수 있다.
//    객체가 필요한 이유
//    변수에는 오직 1 개의 값만 넣을수 있다.
//    프로그래밍을 하다보면 변수에 값을 여러개 넣을 필요가 있을 때 있다.
//    그래서 고안된것이 객체이다
//    객체는 커피캐리어에 비유될수 있다.
//    커피 캐리어에는 커피를 여러잔 담을 수 있다.
//    커피 캐리어는 용도에 따라 종류가 여러가지가 있다.
//    프로그래밍을 할 때 상황에 따라 서로 다른 종류의 객체 여러개가 필요하다.
//    객체를 일종의 제품으로 보았을 때 객체를 만들기 위해서는 설계도 즉 클래스가 필요하다.
//    객체는 너무 커서 변수에 담을 수 없다.
//    그래서 고안된 것이 참조이다.
//    클래스로는 3가지를 할 수 있다.
//      클래스는 객체를 만들고 그 객체에 접근하는 참조값도 만들 수 있다. 그리고 또 참조값을
//      담을 변수(레퍼런스 변수)도 만들 수 있다.
//    변수에는 오직 1차원적인 값만 저장할 수있다.
//    1차원적인 값(데이터)
//      5/ 3.14/ "a"/ true
//    복잡한 값 = 객체
//    변수에는 객체를 저장할 수 없다
//    객체는 너무 크고 변수는 작다.
//    객체는 여러가지 값(데이터)의 조합이다. 여러가지의 값이 억지로 하나의 변수에 들어가면
//    그것들이 한 덩어리로 해석된다.
//    즉 변수에 1과 2를 넣으면 다른사람들은 1과 2의 조합이 아닌 12로 본다.
//    new 사람(); 을 하면 2가지가 만들어진다.
//      객체 / 객체에 접근 가능한 참조값
//    참조값을 객체 스스로는 this 라고 부른다.
