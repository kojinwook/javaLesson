package day3.Exam;

public class ScopeExam2 {
    public static void main(String[] args) {
        // 문제 : 자동차 객체를 담을 변수를 만들어주세요.
        // class Car{} 함수 만들기
        // 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
        // Car c1 = new Car();
        // Car c2 = new Car();
        // 각 자동차가 자신의 최고속력으로 달리게 해주세요.
        // class Car{int 최고속력 void run(){System.out.println(최고속력);}}
        // 출력 : 자동차가 최대속력 220km로 달립니다.
        //  c1.최고속력 = 220
        // 출력 : 자동차가 최대속력 250km로 달립니다.
        // c2.최고속력 = 250

        // 객체를 만들때는 new 키워드를 사용한다.
        // 자동차 class 로 만들어진 자동차 객체 저장하는 변수는 타입이 class 와 동일해야한다.
        자동차 자동차1 = new 자동차(); // 자동차1 변수에 자동차 객체가 저장된다.
        자동차1.최고속력 = 220;
        자동차1.run();
        자동차 자동차2 = new 자동차(); // 자동차2 변수에 자동차 객체가 저장된다.
        자동차2.최고속력 = 250;
        자동차2.run();





    }
}
class 자동차 { int 최고속력;
    public void run(){
        System.out.println(
                "자동차가 최대속력"+ 최고속력+"km로 달립니다.");
    }
}

