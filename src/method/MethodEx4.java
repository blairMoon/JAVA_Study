package method;
import java.util.Scanner;
public class MethodEx4 {
    public static void main(String[] args) {
        int balance = 0;
        while (true) {

            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");
            Scanner scanner = new Scanner(System.in);
            System.out.println("선택:");
            int selectMenu  = scanner.nextInt();
            if (selectMenu == 1){
                System.out.println("입금액을 입력하세요:");
                int depositÅmount  = scanner.nextInt();
               balance = deposit(balance,depositÅmount);

            }else  if (selectMenu == 2) {
                System.out.println("출금액을 입력하세요");
                int withdrawAmount  = scanner.nextInt();

                balance = withdraw(balance,withdrawAmount);

            }else  if (selectMenu == 3 ){
                System.out.println("현재잔액: " + balance +"원");
            }else  {
                System.out.println("시스템을 종료합니다.");
                break;
            }

        }


    }
    public  static  int deposit(int balance,int depositAmount) {
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance +"원");
        return  balance;
    }
    public  static  int withdraw(int balance,int withdrawAmount) {
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;

            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance+"원");
        }else  {
            System.out.println(withdrawAmount +"원을 출금하려고 했으나 잔액이 부족합니다. 현재 잔액" + balance);
        }
        return  balance;
    }


}
