package day5.Lesson.ConstructorChain;

public class ConstructorChain {
    public static void main(String[] args) {
        동물 a동물 = new 동물();
        고양이 a고양이 = new 고양이();
    }
}
class 동물{

    public 동물(){} // 기본생성자 추가
    public 동물(int 나이){ // 자바에서는 매게변수가 다르면 같은이름으로 여러개를 만들수 있음
//        System.out.println("동물이 생성되었습니다.");
        }
}
class 고양이 extends 동물{
    public 고양이(){
        //super();부모생성자 호출
        // this(); 자기자신 호출
//        System.out.println("고양이가 생성되었습니다.");
    }
    }

