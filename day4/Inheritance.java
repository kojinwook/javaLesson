package day4;

public class Inheritance {
    public static void main(String[] args) {
        // 프로그래밍 -> 중복과의 싸움
        // 데이터의 중복 -> 변수
        // 코드의 중복 -> 함수
        // 변수. 함수의 중복 -> 클래스, 객체
        // 객체의 중복 -> 상속
        Dog d1 = new Dog(); // Dog 를 d1에 복사
        d1.bark(); //d1의 bark 값을 구함
        d1.breathe();   // breathe 값을 구함

        Cat c1 = new Cat(); // Cat 를 c1 에 복사
        c1.meow();
        c1.breathe();


    }
}

class Animal{ // Animal 이라는 함수를 만들어줌
    public void eat(){
        System.out.println("먹는다");
    } // Animal 함수의 eat 값을 나타냄
    public void breathe(){
        System.out.println("숨을쉰다!!");
    }


}
class Dog extends Animal{         // extends 는 자바가 (1 extends 2 : 1이 2인걸로) 인식한다.
    // Dog 를 Animal 로 인식한다.
    public void bark(){
        System.out.println("멍멍");
    } // Dog 의 bark 는 다른거기때문에 따로 표시해줌

}
 class Cat extends Animal{
    public void meow(){
        System.out.println("야옹");
    }

 }
