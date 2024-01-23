package array;
import java.util.Scanner;
public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수를 입력하세요:");
        int theNumberOfNum = scanner.nextInt();
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        int[] array = new int[theNumberOfNum];
        System.out.println( theNumberOfNum+ "개의 정수를 입력하세요.");
        for (int i = 0;i < theNumberOfNum;i++){
            int num = scanner.nextInt();
            array[i] = num;
        }
        for (int i : array) {
            if (i > maxNum){
                maxNum = i;
            }
            if (i < minNum) {
                minNum = i;
            }


        }
        System.out.println("maxNum = " + maxNum);
        System.out.println("minNum = " + minNum);

    }

}
