package day3;

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
        Person p3 = p1;  // 홍길동 정보를 p3에 저장  (참조값을 복사한것)
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

