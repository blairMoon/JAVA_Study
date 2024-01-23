package array;
import java.util.Scanner;

public class ArrayEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("배열의 길이를 입력해주세요");
        int numLength = scanner.nextInt();
        int[] array = new int[numLength];

        for (int i = 0;i < numLength;i++) {
            System.out.println("배열에 넣을 숫자를 입력해주세요");
            int num = scanner.nextInt();
            array[i] = num;
        }

        for (int i =array.length - 1 ; i >= 0 ; i--){
            if (i == 0 ) {
                System.out.print(array[i]);
                break;
            }

            System.out.print(array[i] +",");
        }

    }
}
