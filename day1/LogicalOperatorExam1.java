package day1;

public class LogicalOperatorExam1 {
    public static void main(String[] args) {
        //홀수와 짝수를 구별해주세요.
        // num 이 짝수면 even, 홀수면 odd 출력해주세요.
        // 짝수 판별 : 2로 나누어서 떨어지면 짝수
        int num = 7;
        if(num % 2 == 0) {
            System.out.println("even");
        }
        else if(num % 2 != 0){   // else 뒤에 if() 생략가능
            System.out.println("odd");
        }

        }
    }
