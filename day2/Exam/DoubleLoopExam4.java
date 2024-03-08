package day2.Exam;

public class DoubleLoopExam4 {
    public static void main(String[] args) {
        // 출력

//        정답
        int y = 5;

        for(int i = 1; i <= y; i++) {
            for(int j = 1; j <= y-i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }





        /*

    높이 : [3]

      *
     **
    ***

    */

    /*

    높이 : [5]

        *
       **
      ***
     ****
    *****

    */

    /*

    높이 : [7]

          *
         **
        ***
       ****
      *****
     ******
    *******

    */
    }
}
