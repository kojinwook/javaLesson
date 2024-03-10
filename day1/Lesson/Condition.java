package day1.Lesson;

public class Condition {
    public static void main(String[] args) {
        // if소중 = if(){} : ()가 참이면 {}실행

        int a = 100;

        if(a>50){
            System.out.println("hi");
        }

        // 예제
        //소지금에 따른 야식메뉴

        // 20000원 이상 : 치킨
        // 20000원 이하 : 떡볶이

        int money = 30000;

        if(money >= 20000){
            System.out.println("치킨");
        }
        if(money <= 20000){
            System.out.println("떡볶이");
        }

        // 1. 맑음 2. 흐림 3. 비 4. 눈


        // 맑음 : 날씨가 맑습니다. 나들이가세요.
        // 흐림 : 날씨가 흐립니다. 집에 게세요.
        // 비 : 날씨가 비옵니다. 우산을 챙기세요.
        // 눈 : 날씨가 눈옵니다. 눈사람을 만드세요.
        int weather = 4;

        //택일구조
        if(weather == 1) {
            System.out.println("날씨가 맑습니다. 나들이가세요.");
        }
        else if(weather == 2) {
            System.out.println("날씨가 흐립니다. 집에 계세요.");
        }
        else if(weather == 3) {
            System.out.println("날씨가 비옵니다. 우산을 챙기세요.");
        }
        else if(weather == 4) {
            System.out.println("날씨가 눈옵니다. 눈사람을만드세요.");
        }

        // 택일 구조 (else if)를 사용하면 연산상의 효율성과 조건식의 간결함을 얻을수 있다.
        int age = 25;

        if(age <= 13){

            System.out.println("초등학생");
        }
        else if (age <= 17){
            System.out.println("중학생");
        }
        else if(age <= 19){
            System.out.println("고등학생");
        }
        else{
            System.out.println("성인");
        }

        // else 같은 경우는 마지막에 조건을 생략하고 사용 가능 else if (){} >> if ()  생략가능
        // (조건문 덩어리 마지막에 와야 함)


    }
}
