package day4;

public class day3Exam {

    public static void main(String[] args) {
        Account a1 = new Account();  // 철수 계좌

        a1.deposit(1000); // 1000원을 예금했습니다.
        a1.deposit(2000); // 2000원을 예금했습니다.
        a1.deposit(3000); // 3000원을 예금했습니다.
        // 예금 금액이 추가됨
        int money = a1.withdraw(400); // 400원을 인출함
        System.out.println(money); // 400

        int remainder = a1.getRemainder(); // 남은돈
        System.out.println(remainder); // 5600

        money = a1.withdraw(1400); // 1400원을 인출함
        System.out.println(money); // 1400

        remainder = a1.getRemainder();
        System.out.println(remainder); // 4200

        Account a2  = new Account(); // 영희계좌
        a2.deposit(1000);

        remainder = a1. getRemainder(); // 철수 계좌 잔액
        System.out.println(remainder);

        int remainder2 = a2.getRemainder(); // 영희 계좌 잔액
        System.out.println(remainder);
    }
}

