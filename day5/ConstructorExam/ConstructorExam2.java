package day5.ConstructorExam;

public class ConstructorExam2 {
    public static void main(String[] args) {
        //출력 : 아래와 같이 출력되게 해주세요.
        사람 a사람 = new 사람();
        a사람.나이 = 10;
        a사람.a왼팔 = new 팔();

        System.out.println(a사람.a왼팔.길이 + "cm");
        // 출력 : 100cm
    }

    static class 사람 {
        int 나이;
        팔 a왼팔;

    }

    static class 팔 {
        int 길이 = 100;
    }
}