package day2.Exam;

public class DoubleLoopExam2 {
    public static void main(String[] args) {
        // 구구단은 n단 ~ m단 중 홀수단만 1 ~ limit 까지 곱 중 짝수곱만 출력해주세요.
        int n = 4; // 시작
        int m = 20; // 끝
        int limit = 10; // 곱의 개수
        for(int i = n; i<= m; i++ ){for(int j = 1; j<=limit; j++){if(i % 2 != 0){if(j % 2 ==0){
            System.out.println(i +"*"+j +"="+(i*j));
        }}}}







//        for(int i = 5; i<20; i+=2){for(int j= 2; j<=10; j+=2){
//            System.out.println(i +"*"+j+ "=" +(i*j));}}
//        정답
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("시작 단: ");
//        int n = Integer.parseInt(sc.nextLine());
//        System.out.println("끝 단: ");
//        int m = Integer.parseInt(sc.nextLine());
//        System.out.println("곱 개수: ");
//        int limit = Integer.parseInt(sc.nextLine());
//
//        for(int dan = n; dan <= m; dan++) {
//            if(dan % 2 != 0) {
//                for(int gop = n; gop <= limit; gop++) {
//                    if(gop % 2 == 0) {
//                        System.out.println(dan + " X " + gop + "=" + dan*gop);
//                    }
//                }
//            }
//        }

        /*  입출력 예시
    n은 4, m은 20, limit는 10



    5 * 2 = 10
    5 * 4 = 20
    5 * 6 = 30
    5 * 8 = 40
    5 * 10 = 50

    7 * 2 = 14
    7 * 4 = 28
    7 * 6 = 42
    7 * 8 = 56
    7 * 10 = 70
    ...
    ...
    19 * 2 = 38
    19 * 4 = 76
    19 * 6 = 114
    19 * 8 = 152
    19 * 10 = 190


    */

    }
}
