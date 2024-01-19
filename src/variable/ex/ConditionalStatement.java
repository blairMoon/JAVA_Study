package variable.ex;

public class ConditionalStatement {


    public static void main(String[] args) {
        int score = 95;
        char level = 'a';
        if (score >= 90) {
            level = 'A';
        } else if (score >= 80) {
            level = 'B';
        } else if (score >= 70) {
             level = 'C';
        }else if (score >= 60) {
             level = 'D';
        } else {
             level = 'F';
        }
        System.out.println("학점은"+ level + "입니다.");
    }


}
