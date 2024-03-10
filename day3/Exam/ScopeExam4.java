package day3.Exam;

public class ScopeExam4 {

    public static void main(String[] args) {
        // 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.
        // 그리고 printValue 함수를 완성시켜주세요.
        int num = 10;
        System.out.println(num); // 출력 : 10

        printValue("안녕");
        // 출력 : 안녕
    }

   static void printValue(int a){
        System.out.println(a);
    }
   static void printValue(String a){
        System.out.println(a);
    }
}
