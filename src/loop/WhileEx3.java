package loop;

import java.util.Scanner;

public class WhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("max num을 입력하세요");
        int maxNum  = scanner.nextInt();
        int j = 1;
        int sum = 0;
        while (j <= maxNum) {
            sum += j;
            j++;

        }
        System.out.println("sum = " + sum);
    }
}
