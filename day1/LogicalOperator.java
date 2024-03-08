package day1;

public class LogicalOperator {
    public static void main(String[] args) {
        // 논리연산자

        // &&(And)
        // 둘다 true 일때만 true, 그 외에는 false
        System.out.println(true && true); //true
        System.out.println(true && false); //false
        System.out.println(false && true); //false
        System.out.println(false && false); //false

        // ||(or)
        // 둘다 false 일때만 false, 그 외에는 true
        System.out.println(true || true); //true
        System.out.println(true || false); //true
        System.out.println(false || true); //true
        System.out.println(false || false); //false

        System.out.println(true || false || true || false); // true

        System.out.println(10 > 20 && 3 > 2); //false
    }
}
