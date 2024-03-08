package day4;

public class CastingExam2 {
    public static void main(String[] args) {


        무기 a무기 = new 칼();
        a무기.공격();
        // 출력 : 칼로 공격합니다.

        a무기 = new 활();
        a무기.공격();
        // 출력 : 활로 공격합니다.

    }
}
class 무기  {
    public void 공격(){
    }
}
// 무기안에 공격이 들어가있는거를 나타내준다
// 무기안에는 a무기가 속해있는데 a무기안에는 공격이 속해있다.
// 공격에는 칼과 활이 있다.
class  칼 extends 무기{public void 공격()
{System.out.println("칼로 공격합니다.");}}
// 칼은 무기안에 속해있다.
// 무기 안에는 공격이 속해있다.

class 활 extends 무기{public void 공격()
{System.out.println("활로 공격합니다.");}}
// 활은 무기안에 속해있다.
// 무기안에는 공격이 속해있다.

