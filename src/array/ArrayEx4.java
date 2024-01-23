package array;
import java.util.Scanner;
public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수를 입력하세요:");
        int theNumberOfNum = scanner.nextInt();

        System.out.println("5개의 정수를 입력하세요:");


        int sum = 0;
        for (int i = 0 ;i < theNumberOfNum;i++){
            int num = scanner.nextInt();
            sum += num;
        }
        double average =(double) sum / theNumberOfNum;
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);



    }
}
