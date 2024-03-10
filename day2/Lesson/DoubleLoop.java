package day2.Lesson;

public class DoubleLoop {
    public static void main(String[] args) {
        for(int i =1; i<= 5; i++){
            System.out.println(i);
        }
        for(int i =1; i<= 5; i++){
            System.out.println(i);
        }
        for(int i =1; i<= 5; i++){
            System.out.println(i);
        }
        for(int i= 0; i < 3; i++ ){
            for(int j =1; j<= 5; j++) {
                System.out.println(i);
            }

        }

        // 구구단 2 ~ 9 단 출력
        System.out.println("2 x 1 = 2");
        System.out.println("2 x 2 = 4");
        System.out.println("2 x 3 = 6");
        System.out.println("2 x 4 = 8");
        for(int i= 1; i <= 4; i++){
            System.out.println("2 x " +i + "=" + (2 *i));
        }
        int dan;
        dan = 3;
        for(int j = 1; j<=9; j++){
            System.out.println(dan + " x " + j + "=" + (dan*j));
        }
        dan = 4;
        for(int j = 1; j<=9; j++){
            System.out.println( dan+"x " + j + "=" + (dan*j));
        }
        // 2단 8번 만들어 보겠다.
        for(int j = 0; j <8; j++){
            int dan2 =2;
        for(int i= 1; i<=9; i++){ System.out.println(dan2 + "x" +i +"=" + (dan2 *i));}
        }





    }
}
