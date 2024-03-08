package day2;

import java.time.Period;

public class ObjectAndClass {
    public static void main(String[] args) {
        // 객체 >> 폴더

        // 사람 표현
        // 이름, 나이, 거주지

        // 사람1명 = 객체
        String name = "홍길동";
        int age = 20;
        String home = "서울";

        System.out.println(home + "사는" + age + "살" + name + "입니다.");

        String name2 = "이순신";
        int age2 = 30;
        String home2 = "부산";

        System.out.println(home2 + " 사는" + age2 + "살" + name2 + " 입니다.");

        // 이순신 정보 복사
        String name3 = name2;
        int age3 = age2;
        String home3 = home2;

        //=============================================================================================

        // 원본 class , 복사본 객체 Object/instance

        // 홍길동이 자기 정보를 기입
        // 이력서 복사
        Person1 p1 = new Person1();
        // 복사본에다가 홍길동의 정보를 기입
        p1.name = "홍길동";
        p1.age = 20;
        p1.home = "서울";

        // 이순신 자기정보를 기입
        // 이력서 원본 복사
        Person1 p2 = new Person1();


        // 복사본에다가 이순신 정보를 기입
        p2.name = "이순신";
        p2.age = 30;
        p2.home = "부산";

        // 홍길동 자기소개
        System.out.println(p1.home + " 사는" + p1.age + "살" + p1.name + " 입니다.");


        // 이순신 자기소개
        System.out.println(p2.home + " 사는" + p2.age + "살" + p2.name + " 입니다.");

        // 객체 복사
        Person1 p3 = p2;

        System.out.println(p3.name);


        // 자동차 1개 생성
        // 앞과 뒤자리에 있는 car는 똑같아야한다.
        Car1 c1 = new Car1();
        c1.model = "소나타";
        c1.year = 2020;
        c1.price = 3000;
        System.out.println(c1.model);

    }
}




    // 새로운 클래스 생성
    class Person1 {
        String name; // 8바이트
        int age; // 4바이트
        String home; // 8바이트

    }

    class Car1 {
        String model;
        int year;
        int price;
    }
    // class 이름 : 이름은 중복되면 안된다.
    // 스택과 힙 메모리가 있는데 스택은 8바이트를 최대로 포함 할수 있음