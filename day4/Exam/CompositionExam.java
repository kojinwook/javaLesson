package day4.Exam;

public class CompositionExam {
    public static void main(String[] args) {
        // 출력 : 아래와 같이 출력되게 해주세요.
        사람 a사람 = new 사람(); //사람을 복사함
        a사람.나이 = 20; //사람함수를 만들어주고 나이값을 넣어줌 >> int 나이;
        a사람.a왼팔 = new 팔();
        // a사람과 팔은 같은존재
        // a사람에게 a왼팔을 복사함
        // 구성에의해 팔은 사람함수안에 포함됨
        // 팔이라는 함수를 만들어줌
        // 사람안에는 a사람이 포함이 되어있고 그 a사람안에는 팔이 포함되어있다
        // 사람이라는 함수안에 팔의 a왼팔을 정의함

        System.out.println(a사람.a왼팔.길이 + "cm");
        // 출력 : 100cm
    }
}
class 사람{
    int 나이;
    팔 a왼팔;
    // 변수선언 팔 함수의 a왼팔을 선언
    // 단 팔이라는 클래스가 실제로 존재하고 그안에 필요한 메소드와 속성이 정의되어 있어야한다.
}

class 팔 {

    int 길이 = 100;

}
