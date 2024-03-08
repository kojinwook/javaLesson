package day2.Exam;

public class DoubleLoopExam3 {
    public static void main(String[] args) {

        /*
    높이 : [3]
    *
    **
    ***
     */
        int y =3;

        for(int i = 1; i <= y; i++){
            for(int j =1; j <= i; j++){
            System.out.print("*");
        }
            System.out.println();
        }

    /*
    높이 : [5]
    *
    **
    ***
    ****
    *****
     */
        int z =5;

        for(int i = 1; i <= z; i++){
            for(int j =1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

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
        int x =7;

        for(int i = 1; i <= x; i++){
            for(int j =1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
