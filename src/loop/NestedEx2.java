package loop;
import java.util.Scanner;

public class NestedEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("피라미드 층수를 입력하세요");
        int rows = scanner.nextInt();
        for (int i = 1;i <=rows;i++){
            System.out.println("*".repeat(i));
        }
        //check
    }
}
