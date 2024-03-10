package day3.Lesson;

import day3.Lesson.Calculator;

public class Scope {


    // 변수가 많아지면 묶어서 관리 -> 배열, 클래스

    // 함수가 많아지면 묶어서 관리 -> 클래스
    public static void main(String[] args) {
        // 원론적으로는 함수 하나에서 모든걸 만들 수 있음
        // 코드를 함수로 쪼개서 관리

        // 함수는 같은 클래스 내에 있는 함수끼리만 호출 및 사용 가능

        // 소유자에게 요청을 해야 함.
        double result = Calculator.plus(1, 2);
        System.out.println(result);

        // Scope
        // 변수의 유효범위

        // 지역에서 만들어져서 지역에서만 사용되는 변수 >> 지역변수
        // 함수 내에  모든 변수는 지역변수
        int a = 10; // a 변수의 유효범위는 main 함수 내부
        {
            int b = 20; // b 변수의 유효범위는 {} 블록 내부
             }

            if (true) {
                int c = 50;
            }
        {
            int d;
        }
        {
//            System.out.println(d);
        }
            // 같은 지역 내에서는 동일한 이름으로 변수를 2개 이상 만들수 없다.
            // 동일한 이름으로 변수를 2개 이상만들려면 지역을 달리하면 된다.
            // 인스턴스(객체) 변수
            // 클래스 내에서 만들어져서 객체가 사용되는 변수


        }
    }

