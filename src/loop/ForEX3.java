package loop;
import java.util.Scanner;

public class ForEX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("max num을 입력하세요");
        int maxNum  = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= maxNum; i++){
            sum += i;

        }
        System.out.println("sum = " + sum);
    }
}
