package day4.Lesson;

public class Account{ // Account 객체복사가 되었으므로 class Account 함수를 만들어준다.
    int remainder = 0; // 반복하는데 있어 deposit 안에있으면 계속해서 0원이 되므로 뺴줌
    public void deposit(int depositMoney){ // ()안에는 예금금액을 넣음
    // static를 빼고 deposit 함수를 만들어줌
        remainder += depositMoney; // depositMoney를 계속해서 더해주므로 += 기호를 씀
        System.out.println(depositMoney +"원을 예금했습니다.");
        System.out.println("잔액은"+ remainder +"원입니다.");
    }//println을 이용해 예금 금액을 나타냄

    public int withdraw(int withdrawMoney){ // 인출 금액을 구함
        remainder -= withdrawMoney; // 남은돈 - 인출금액 이므로 -= 기호를 씀
        return withdrawMoney;
        // 인출금액을 나타내야 하므로 remainder 이 아닌 withdrawMoney를 retrun함
    }
    public int getRemainder(){ // 남은돈을 구함
        return remainder;   // 남은돈을 나타내야 하므로 remaineder 을 return함
    }
}

