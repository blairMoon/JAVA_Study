package variable.ex;
import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요:");
        int x  = scanner.nextInt();
        String num = x % 2 == 0 ? "짝수" :"홀수";
        System.out.println(num);




    }


}
