package method;

public class MethodEx4 {
    public static void main(String[] args) {
        while (true) {
            int balance = 0;
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");

        }


    }
    public  static  int deposit(int balance,int depositAmount) {
        balance += depositAmount;

        System.out.println(depositAmount +"원을 입금하였습니다. 현재 잔액: "+ balance);

        return  balance;
    }
    public  static  int withdraw(int balance,int withdrawAmount) {
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;

            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance);
        }else  {
            System.out.println(withdrawAmount +"원을 출금하려고 했으나 잔액이 부족합니다. 현재 잔액" + balance);
        }
        return  balance;
    }


}
