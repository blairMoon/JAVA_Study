package array;
import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("배열의 길이를 입력해주세요");
        int numLength = scanner.nextInt();
        int[] array = new int[numLength];

        for (int i = 0;i < numLength;i++) {
            System.out.println("배열에 넣을 값을 입력해주세요");
            int numArray = scanner.nextInt();
            array[i] = numArray;

        }
        for (int i = 0;i < array.length;i ++) {
            if (i == array.length - 1){
                System.out.println(array[i]);
                break;
            }

            System.out.print( array[i] + ",");
        }

}}
