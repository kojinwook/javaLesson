package day3.Lesson;

public class Person {

            // 변수 -> 사물, 개념의 상태값
            String name;
            // static int age = 20; 함수가 공유하는 변수 >> 클래스 변수
             int age; // 객체의 함수가 공유하는 변수 -> 인스턴스 변수
            String home;

            // 인류 평균 나이 -?> 모든 사람이 공유하는 변수 -> 클래스 변수
            static int average = 30; // 인류 평균나이 30 가정


            // static 이 붙은 것은 static 이 붙지 않은것을 사용할 수 없음.
            // 반대는 가능 (static이 붙지 않은것은 static이 붙은 것을 사용할수 있음.)
            // 객체의 변수와 함수에는 특별한 이유가 없으면 static 을 붙이지 않는다.

            // 함수 -> 동작(나이를 먹는다. 걷는다. 밥을 먹는다.)
        public  void introduce(){
//            int age = 20; // 지역변수
            System.out.println("안녕하세요 저는" + age + "살" + name+"입니다.");
            System.out.println("인류의 평균 나이는"+ average + "입니다.");
        }
        public  void addAge(){
//        int age = 20; // 지역변수 함수{}안에 있는것은 함수안에서만 쓰이므로 지역안에 있다해서
                        // 지역변수라고 한다.
        age ++;
        }


}
