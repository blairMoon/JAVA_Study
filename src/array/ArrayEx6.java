package array;
import java.util.Scanner;
// 학생수입력받기 , 국어, 수학, 영어 점수 입력 받기 (배열로 만들어서 돌리자아 )
public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("성적을 입력할 학생 수를 입력하세요");
        int theNumberOfNum = scanner.nextInt();

        String[] arraySubject = new String[]{"국어", "영어", "수학"};
        int [][] arrScore = new int[theNumberOfNum][arraySubject.length];

        for (int i = 0; i < theNumberOfNum; i++){

            System.out.println((i+1) + "번 학생의 성적을 입력해 주세요:");
           for (int j = 0; j < arraySubject.length ; j++){
               System.out.println( arraySubject[j] + "성적을 입력해주세요:");
               int score = scanner.nextInt();
               arrScore[i][j] = score;

           }


        }
        for (int k = 0;k < arrScore.length;k++){
            int totalScore = 0;
            for (int l = 0;l < arrScore[k].length;l++){
                totalScore += arrScore[k][l];
            }
           double average = (double) totalScore / arrScore.length;
            System.out.println((k+1)+ "번 학생의 총점: " + totalScore + " 평균:"+ average);
        }


    }
}


