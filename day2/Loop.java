package day2;

public class Loop {
    public static void main(String[] args) {

        // 반복문
        // 반복문을 이용해 동일한 명령을 여러번 실행

        if (true){
            System.out.println("실행");
        }
        // if랑 동일 한번 실행하면 계속해서 실행
        //  true 는 무제한 실행 false 는 실행되지 않음
//        while (true){
//            System.out.println("실행");
//        }
        // 주석 한번에 여러번 하는법 : 드래그하고 Ctrl + /

         // 원하는 만큼만 반복
        int cnt = 0; // 반복횟수 세는 용도

        while (cnt < 5){ // 5번 반복
            System.out.println("실행1");
            cnt++;
        }

        // for문
        for(int cnt2 = 0; cnt2 < 5; cnt2++){
            System.out.println("실행2");
        }

        // 1부터 10까지 출력
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        // 1부터 10 까지 짝수 출력 -v1
        for(int i = 2; i <=10; i+=2){
            System.out.println(i);
        }

        // 1부터 10까지 짝수 출력 v2
        for(int i =2; i <= 10; i ++){
            if(i % 2 == 0) {
                System.out.println(i); //짝수일 때만 출력
            }
            // 2의 배수 == 짝수
            // 2의 배수는 2로 나누어 떨어진다 >> 나머지가 0이다.
            // 나머지 구하는 연산자 %

        }


        // 1부터 10까지 4의 배수 출력
        for(int i = 4; i <= 10; i +=4 ){
            System.out.println(i);
        }








    }
}
