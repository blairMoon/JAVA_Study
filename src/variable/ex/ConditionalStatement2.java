package variable.ex;
import java.util.Scanner;



/*
문제: "거리에 따른 운송 수단 선택하기"
주어진 거리에 따라 가장 적합한 운송 수단을 선택하는 프로그램을 작성하자. 다음과 같은 기준을 따른다.
거리가 1km 이하이면: "도보" 거리가 10km 이하이면: "자전거" 거리가 100km 이하이면: "자동차" 거리가 100km 초과이면: "비행기"
거리는 변수( `int distance` )로 지정하고, 해당 변수를 기반으로 운송 수단을 출력하자.
*/


public class ConditionalStatement2 {
    public static void main(String[] args) {
        System.out.println("거리를 입력하세요(km 기준) : ");
        Scanner scanner = new Scanner(System.in);
        int distance  = scanner.nextInt();
        if (distance <= 1) {
            System.out.println("도보");
        } else if (distance <=10) {
            System.out.println("자전거");
        }else if (distance <= 100) {
            System.out.println("자동차");
        } else {
            System.out.println("비행기");
        }


    }
}
